package com.company;
import com.company.gen.EBaseVisitor;
import com.company.gen.EParser;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Alex on 28.01.2018.
 */
public class MyVisitor extends EBaseVisitor<String> {
    List<Exception> exceptions = new ArrayList<>();
    List<String> erors = new ArrayList<>();

    VariableStorage variables = new VariableStorage();

    Map<String, String> subprograms = new HashMap<>();
    Map<String, EParser.SignatureContext> subprogramSignatures = new HashMap<>();

    boolean checkSignatures(EParser.Input_signatureContext in, EParser.SignatureContext sig) {
        boolean b = true;
        if (sig == null || in == null)
            return false;
        if (in.ID().size() == sig.ID().size()) {
            for (int i = 0; i < sig.type().size(); i++) {
                if (variables.get(in.ID(i).getText()) == null || !variables.get(in.ID(i).getText()).equalsIgnoreCase(visitType(sig.type(i))))
                    b = false;
            }
        } else b = false;
        return b;
    }

    String main =/* "import com.company.MatrUtils;\n" +
            "import com.company.Matrix;\n" +
            "\n" +*/
                    "public class RunProgram {\n" +
                    "    MatrUtils u = new MatrUtils();\n" +
                    "\n" +
                    "    public static void main(String[] args) {\n" +
                    "        try {\n" +
                    "            new RunProgram().run();\n" +
                    "        } catch (Exception e) {\n" +
                    "            System.err.println(e.getMessage());\n" +
                    "        }\n" +
                    "    }\n" +
                    "    void run() throws Exception\n";

    @Override
    public String visitPrint_number(EParser.Print_numberContext ctx) {
        return "\tSystem.out.println(" + ctx.NUMBER().getText() + ");";
    }

    @Override
    public String visitPrint_string(EParser.Print_stringContext ctx) {
        return "\tSystem.out.println(\"" + ctx.ID().getText() + "\");";
        // return ctx.getText();
    }

    @Override
    public String visitPrint_id(EParser.Print_idContext ctx) {
        if (variables.get(ctx.ID().getText()) == null) {
            erors.add("Can't find symbol " + ctx.ID().getText());
        }
        return "\tSystem.out.println(" + ctx.ID().getText() + ");";
    }

    @Override
    public String visitPrint_mat_row(EParser.Print_mat_rowContext ctx) {
        return "\tSystem.out.println(" + visitGet_mat_row_by_id(ctx.get_mat_row_by_id()) + ");";
    }

    @Override
    public String visitGet_mat_row_by_id(EParser.Get_mat_row_by_idContext ctx) {
        return "u.get(" + ctx.ID().getText() + "," + ctx.digit_expression().getText() + ")";
    }

    @Override
    public String visitProgram(EParser.ProgramContext ctx) {
        String buf = main;
        buf += visitBlock(ctx.block()) + "\n";
        return buf;
    }

    @Override
    public String visitGlobal_program(EParser.Global_programContext ctx) {
        String buf = "";
        for (int i = 0; i < ctx.subprogram_return().size(); i++) {
            if (visitType(ctx.subprogram_return(i).type()) == "int")
                buf += "private int " + visitSubprogram_return(ctx.subprogram_return(i)) + "\n";
            else
                buf += "private Matrix " + visitSubprogram_return(ctx.subprogram_return(i)) + "\n";
        }
        for (int i = 0; i < ctx.subprogram_non_return().size(); i++)
            buf += "private void " + visitSubprogram_non_return(ctx.subprogram_non_return(i)) + "\n";
        return visitProgram(ctx.program()) + buf;
    }

    @Override
    public String visitType(EParser.TypeContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitSubprogram_return(EParser.Subprogram_returnContext ctx) {
        String sign = "";
        if (subprograms.get(ctx.ID().getText()) == null)
            subprograms.put(ctx.ID().getText(), visitType(ctx.type()));
        else
            erors.add("Subprogram name " + ctx.ID().getText() + " already used");
        if (ctx.signature() == null)
            sign = "()";
        else {
            sign = visitSignature(ctx.signature());
            subprogramSignatures.put(ctx.ID().getText(), ctx.signature());
        }
        variables.increm();
        for (int i = 0; i < ctx.signature().type().size(); i++)
            variables.put(ctx.signature().ID(i).getText(), ctx.signature().type(i).getText());
        return ctx.ID().getText() + sign + " throws Exception " + visitBlock_return(ctx.block_return());
    }

    @Override
    public String visitBlock_return(EParser.Block_returnContext ctx) {
        String buf = "";
        String ret = "";
        ret = "return " + ctx.ID().getText() + ";";
        for (int i = 0; i < ctx.statement().size(); i++)
            buf += visitStatement(ctx.statement(i)) + "\n";
        if (variables.get(ctx.ID().getText()) == null)
            erors.add("Error: cant find variable " + ctx.ID().getText() + " at return");
        variables.decrem();
        return "{\n" + buf + ret + "\n}";
    }

    @Override
    public String visitSubprogram_non_return(EParser.Subprogram_non_returnContext ctx) {
        if (subprograms.get(ctx.ID().getText()) == null)
            subprograms.put(ctx.ID().getText(), "void");
        else
            erors.add("Subprogram name " + ctx.ID().getText() + " already used");
        String sign = "";
        if (ctx.signature() == null)
            sign = "()";
        else {
            sign = visitSignature(ctx.signature());
            subprogramSignatures.put(ctx.ID().getText(), ctx.signature());
        }
        variables.increm();
        for (int i = 0; i < ctx.signature().type().size(); i++)
            variables.put(ctx.signature().ID(i).getText(), ctx.signature().type(i).getText());
        return ctx.ID().getText() + sign + " throws Exception " + visitBlock_non_return(ctx.block_non_return());
    }

    @Override
    public String visitBlock_non_return(EParser.Block_non_returnContext ctx) {
        String buf = "";
        String ret = "";
        ret = "return ;";
        for (int i = 0; i < ctx.statement().size(); i++)
            buf += visitStatement(ctx.statement(i)) + "\n";
        variables.decrem();
        return "{\n" + buf + ret + "\n}";
    }

    @Override
    public String visitSignature(EParser.SignatureContext ctx) {
        String buf = "(";
        for (int i = 0; i < ctx.type().size(); i++) {
            String str = "";
            if (ctx.type(i).getText().equalsIgnoreCase("vector") | ctx.type(i).getText().equalsIgnoreCase("matrix"))
                str = "Matrix";
            else str = "int";
            if (i < ctx.type().size() - 1)
                buf += str + " " + ctx.ID(i).getText() + ", ";
            else buf += str + " " + ctx.ID(i).getText() + ")";
        }
        //  buf += ctx.type().get((ctx.type().size() - 1)).getText() + " " + ctx.ID(ctx.type().size() - 1).getText() + ")";
        return buf;
    }

  /*  @Override
    public String visitSubprogram_block(EParser.Subprogram_blockContext ctx) {
        String buf = "";
        String ret = "";
        if(ctx.ID()!=null)
            ret="return "+ctx.ID().getText()+";";
        else
            ret="return ;";
        for (int i = 0; i < ctx.statement().size(); i++)
            buf += visitStatement(ctx.statement(i)) + "\n";
        return "{\n" + buf + ret+"\n}";
    }*/

    @Override
    public String visitBlock(EParser.BlockContext ctx) {
        variables.increm();
        String buf = "{\n";
        for (EParser.StatementContext context : ctx.statement())
            buf += visitStatement(context) + "\n";
        buf += "}\n";
        variables.decrem();
        return buf;
    }

    @Override
    public String visitStatement(EParser.StatementContext ctx) {
        if (ctx.assign_int() != null)
            return visitAssign_int(ctx.assign_int());
        if (ctx.assign_int_by_subprogram() != null)
            return visitAssign_int_by_subprogram(ctx.assign_int_by_subprogram());
        else ////////////////
            if (ctx.programm_call() != null)
                return visitProgramm_call(ctx.programm_call());
            else ////////////////////////
                if (ctx.assign_vec() != null)
                    return visitAssign_vec(ctx.assign_vec());
            /*else if (ctx.set_vec() != null)
                return visitSet_vec(ctx.set_vec());*/
                else if (ctx.set_vec_expr() != null)
                    return visitSet_vec_expr(ctx.set_vec_expr());
                else if (ctx.set_vec_expr_by_mat() != null)
                    return visitSet_vec_expr_by_mat(ctx.set_vec_expr_by_mat());
                else if (ctx.assign_vec_by_subprogram() != null)
                    return visitAssign_vec_by_subprogram(ctx.assign_vec_by_subprogram());
                else
                    ///////////
                    if (ctx.assign_mat() != null)
                        return visitAssign_mat(ctx.assign_mat());
                    else /*if (ctx.set_mat() != null)
                    return visitSet_mat(ctx.set_mat());
                else */if (ctx.set_mat_expr() != null)
                        return visitSet_mat_expr(ctx.set_mat_expr());
                    else
                        ///////////
                        if (ctx.print_number() != null)
                            return visitPrint_number(ctx.print_number());
                        else if (ctx.print_id() != null)
                            return visitPrint_id(ctx.print_id());
                        else if (ctx.print_string() != null)
                            return visitPrint_string(ctx.print_string());
                        else if (ctx.print_mat_row() != null)
                            return visitPrint_mat_row(ctx.print_mat_row());
                        else
                            ////////////
                            if (ctx.compare() != null)
                                return visitCompare(ctx.compare());
                            else if (ctx.while_cicle() != null)
                                return visitWhile_cicle(ctx.while_cicle());
                            else return "";

    }

    @Override
    public String visitProgramm_call(EParser.Programm_callContext ctx) {
        if (subprograms.get(ctx.ID().toString()) == null) {
            erors.add("Initialize error: cant find subprogram " + ctx.ID().getText());
        } else if (!checkSignatures(ctx.input_signature(), subprogramSignatures.get(ctx.ID().getText()))) {
            erors.add("Error: cant find such arguments in subprogram " + ctx.ID().getText());
        } else {
                return ctx.ID().getText() + ctx.input_signature().getText() + ";";
            }
        return "";
    }

    @Override
    public String visitAssign_vec(EParser.Assign_vecContext ctx) {
        if (variables.get(ctx.ID().getText()) != null) {
            if (ctx.VECTOR() != null) {
                erors.add("Initialize error: Variable " + ctx.ID().getText() + " already used");
            } else if (!variables.get(ctx.ID().getText()).equalsIgnoreCase("vector")) {
                erors.add("Cast error:  variable " + ctx.ID().getText() + " is not vector");
            } else
                return "\t" + ctx.ID() + " = new Matrix(new double[][]{" + ctx.VECTOR_EXPR().getText() + "});";
        } else {
            variables.put(ctx.ID().getText(), "vector");
            return "\tMatrix " + ctx.ID() + " = new Matrix(new double[][]{" + ctx.VECTOR_EXPR().getText() + "});";
        }
        return "";

        /*//System.out.println(ctx.ID().getText()+" ");
        variables.put(ctx.ID().getText(), "vector");
        return "\tMatrix " + ctx.ID() + " = new Matrix(new double[][]{" + ctx.VECTOR_EXPR().getText() + "});";*/
    }

    /*@Override
    public String visitSet_vec(EParser.Set_vecContext ctx) {
        return "\tMatrix " + ctx.ID().get(0) + " = new Matrix(" + ctx.ID().get(1) + ");";
    }
*/
    @Override
    public String visitSet_vec_expr(EParser.Set_vec_exprContext ctx) {
        if (variables.get(ctx.ID().getText()) != null) {
            if (ctx.VECTOR().size() != 1) {
                erors.add("Initialize error: Variable " + ctx.ID().getText() + " already used");
            } else if (!variables.get(ctx.ID().getText()).equalsIgnoreCase("vector")) {
                erors.add("Cast error: variable " + ctx.ID().getText() + " is not vector");
            } else
                return "\t" + ctx.ID() + " =" + visitExpression(ctx.expression()) + ".to_vec;";
        } else {
            variables.put(ctx.ID().getText(), "vector");
            return "\tMatrix " + ctx.ID() + " =" + visitExpression(ctx.expression()) + ".to_vec;";
        }
        return "";
        /*
        return "\tMatrix " + ctx.ID() + " =" + visitExpression(ctx.expression()) + ";";*/
    }

    @Override
    public String visitSet_vec_expr_by_mat(EParser.Set_vec_expr_by_matContext ctx) {
        if (variables.get(ctx.ID().getText()) != null) {
            if (ctx.VECTOR() != null) {
                erors.add("Initialize error: Variable " + ctx.ID().getText() + " already used");
            } else if (!variables.get(ctx.ID().getText()).equalsIgnoreCase("vector")) {
                erors.add("Cast error:  variable " + ctx.ID().getText() + " is not vector");
            } else
                return "\t" + ctx.ID().getText() + " = " + visitGet_mat_row_by_id(ctx.get_mat_row_by_id()) + ";";
        } else {
            variables.put(ctx.ID().getText(), "vector");
            return "\tMatrix " + ctx.ID().getText() + " = " + visitGet_mat_row_by_id(ctx.get_mat_row_by_id()) + ";";
        }
        return "";
    }

    @Override
    public String visitAssign_vec_by_subprogram(EParser.Assign_vec_by_subprogramContext ctx) {
        if (subprograms.get(ctx.ID(1).toString()) == null) {
            erors.add("Initialize error: cant find subprogram " + ctx.ID(1).getText());
        } else if (!checkSignatures(ctx.input_signature(), subprogramSignatures.get(ctx.ID(1).getText()))) {
            erors.add("Error: cant find such arguments in subprogram " + ctx.ID(1).getText());
        } else if (variables.get(ctx.ID(0).getText()) != null) {
            if (ctx.VECTOR().size() != 1) {
                erors.add("Initialize error: Variable " + ctx.ID(0).getText() + " already used");
            } else if (!variables.get(ctx.ID(0).getText()).equalsIgnoreCase("vector")) {
                erors.add("Initialize error: variable " + ctx.ID(0).getText() + " is not vector");
            } else
                return "\t" + ctx.ID(0).getText() + "=" + ctx.ID(1).getText() + ctx.input_signature().getText() + ";";
        } else {
            if (!subprograms.get(ctx.ID(1).getText()).equalsIgnoreCase("vector")) {
                erors.add("Cast error: subprogram " + ctx.ID(1).getText() + " is not vector");
            } else {
                variables.put(ctx.ID(0).getText(), "vector");
                return "\tMatrix " + ctx.ID(0).getText() + "=" + ctx.ID(1).getText() + ctx.input_signature().getText() + ";";
            }
        }
        return "";

        /*if (variables.get(ctx.ID(0).getText()) != null) {
            if (ctx.VECTOR() != null) {
                erors.add("Initialize error: Variable " + ctx.ID(0).getText() + " already used");
            } else if (!variables.get(ctx.ID(0).getText()).equalsIgnoreCase("vector")) {
                erors.add("Cast error:  variable " + ctx.ID(0).getText() + " is not vector");
            } else
                return "\t" + ctx.ID(0).getText() + " = " + visitGet_mat_row_by_id(ctx.get_mat_row_by_id()) + ";";
        } else {
            variables.put(ctx.ID(0).getText(), "vector");
            return "\tMatrix " + ctx.ID(0).getText() + " = " + visitGet_mat_row_by_id(ctx.get_mat_row_by_id()) + ";";
        }
        return "";*/
    }

    @Override
    public String visitExpression(EParser.ExpressionContext ctx) {
        String buf = "";
        if (ctx.expression().size() == 2) {
            if (variables.get(ctx.expression(0).ID().getText()) == null || variables.get(ctx.expression(1).ID().getText()) == null) {
                erors.add("Error: cant find variable " + ctx.expression(0).ID().getText() + "|" + variables.get(ctx.expression(1).ID().getText()));
                return "";
            } else {
                if (!(variables.get(ctx.expression(0).ID().getText()).equalsIgnoreCase("vector") ||
                        variables.get(ctx.expression(0).ID().getText()).equalsIgnoreCase("matrix")))
                    erors.add("Calculate error: variable " + ctx.expression(0).ID().getText() + " and " + variables.get(ctx.expression(1).ID().getText()));
            }
            if (ctx.MULTIPLY() != null)
                buf += "\tu.mult(" + ctx.expression().get(0).getText() + "," + ctx.expression().get(1).getText() + ")";
            if (ctx.PLUS() != null)
                buf += "\tu.plus(" + ctx.expression().get(0).getText() + "," + ctx.expression().get(1).getText() + ")";
            if (ctx.DIVIDE() != null)
                buf += "\tu.div(" + ctx.expression().get(0).getText() + "," + ctx.expression().get(1).getText() + ")";
            if (ctx.MINUS() != null)
                buf += "\tu.minus(" + ctx.expression().get(0).getText() + "," + ctx.expression().get(1).getText() + ")";
        } else if (ctx.expression().size() == 1) {
            if (variables.get(ctx.expression(0).ID().getText()) == null)
                erors.add("Error: cant find variable " + ctx.expression(0).ID().getText());
            else if (!(variables.get(ctx.expression(0).ID().getText()).equalsIgnoreCase("vector") ||
                    variables.get(ctx.expression(0).ID().getText()).equalsIgnoreCase("matrix")))
                erors.add("Cast error: variable " + ctx.expression(0).ID().getText() + " and " + variables.get(ctx.expression(1).ID().getText()));
            else
                buf += "new Matrix(" + ctx.expression(0).getText() + ")";
        } else if (ctx.expression().size() == 0) {
            if (variables.get(ctx.ID().getText()) == null)
                erors.add("Error: cant find variable " + ctx.ID().getText());
            else if (!(variables.get(ctx.ID().getText()).equalsIgnoreCase("vector") ||
                    variables.get(ctx.ID().getText()).equalsIgnoreCase("matrix")))
                erors.add("Cast error: variable " + ctx.ID().getText() + " is int");
            else buf += "new Matrix(" + ctx.ID().getText() + ")";
        }
        return buf;
    }

    @Override
    public String visitAssign_mat(EParser.Assign_matContext ctx) {
        if (variables.get(ctx.ID().getText()) != null) {
            if (ctx.MATRIX() != null) {
                erors.add("Initialize error: Variable " + ctx.ID().getText() + " already used");
            } else if (!variables.get(ctx.ID().getText()).equalsIgnoreCase("matrix")) {
                erors.add("Cast error:  variable " + ctx.ID().getText() + " is not matrix");
            } else
                return "\t" + ctx.ID() + " = new Matrix(new double[][]" + ctx.MATRIX_EXPR().getText() + ");";
        } else {
            variables.put(ctx.ID().getText(), "matrix");
            return "\tMatrix " + ctx.ID() + " = new Matrix(new double[][]" + ctx.MATRIX_EXPR().getText() + ");";
        }
        return "";

        /*
        if (variables.get(ctx.ID().getText()) != null) {
            erors.add("Initialize error: Variable " + ctx.ID().getText() + " already used");
        } else {
            variables.put(ctx.ID().getText(), "matrix");
            return "\tMatrix " + ctx.ID() + " = new Matrix(new double[][]" + ctx.MATRIX_EXPR().getText() + ");";
        }
        return "";*/


    }
/*
    @Override
    public String visitSet_mat(EParser.Set_matContext ctx) {
        if (variables.get(ctx.ID(0).getText()) != null) {
            if (ctx.MATRIX().size() != 1) {
                erors.add("Initialize error: Variable " + ctx.ID(0).getText() + " already used");
            } else if (!variables.get(ctx.ID(0).getText()).equalsIgnoreCase("matrix")) {
                erors.add("Cast error: Can't cast variable " + ctx.ID(0).getText() + " from " + variables.get(ctx.ID(0).getText()) + " to matrix");
            } else
                return "\tMatrix " + ctx.ID().get(0) + " = new Matrix(" + ctx.ID().get(1).getText() + ");";
        } else {
            variables.put(ctx.ID(0).getText(), "matrix");
            return "\t" + ctx.ID().get(0) + " = new Matrix(" + ctx.ID().get(1).getText() + ");";
        }
        return "";
    }*/

    @Override
    public String visitSet_mat_expr(EParser.Set_mat_exprContext ctx) {
        if (variables.get(ctx.ID().getText()) != null) {
            if (ctx.MATRIX().size() != 1) {
                erors.add("Initialize error: Variable " + ctx.ID().getText() + " already used");
            } else if (!variables.get(ctx.ID().getText()).equalsIgnoreCase("matrix")) {
                erors.add("Cast error:  variable " + ctx.ID().getText() + " is not matrix");
            } else
                return "\t" + ctx.ID() + " =" + visitExpression(ctx.expression()) + ";";
        } else {
            variables.put(ctx.ID().getText(), "matrix");
            return "\tMatrix " + ctx.ID() + " =" + visitExpression(ctx.expression()) + ";";
        }
        return "";

/*
        if (!variables.get(ctx.ID().getText()).equalsIgnoreCase(""))
            return "\t" + ctx.ID() + " =" + visitExpression(ctx.expression()) + ";";
        else
            return "\tMatrix " + ctx.ID() + " =" + visitExpression(ctx.expression()) + ";";*/
    }
/////////////////////////////

    @Override
    public String visitDigit_expression(EParser.Digit_expressionContext ctx) {
        if (ctx.ID() != null)
            if (variables.get(ctx.ID().getText()) == null)
                erors.add("Error: cant find variable in digit expression " + ctx.ID().getText());
        for (EParser.Digit_expressionContext context : ctx.digit_expression())
            visitDigit_expression(context);
        return "";
    }

    @Override
    public String visitAssign_int(EParser.Assign_intContext ctx) {
        visitDigit_expression(ctx.digit_expression());
        if (variables.get(ctx.ID().getText()) != null) {
            if (ctx.INT().size() != 1) {
                erors.add("Initialize error: Variable " + ctx.ID().getText() + " already used");
            } else if (!variables.get(ctx.ID().getText()).equalsIgnoreCase("int")) {
                erors.add("Cast error: variable " + ctx.ID().getText() + " is not int");
            } else
                return "\t" + ctx.ID().getText() + "=" + ctx.digit_expression().getText() + ";";
        } else {
            variables.put(ctx.ID().getText(), "int");
            return "\tint " + ctx.ID().getText() + "=" + ctx.digit_expression().getText() + ";";
        }
        return "";
    }

    @Override
    public String visitAssign_int_by_subprogram(EParser.Assign_int_by_subprogramContext ctx) {
        System.out.println(subprograms);
        if (subprograms.get(ctx.ID(1).toString()) == null) {
            erors.add("Initialize error: cant find subprogram " + ctx.ID(1).getText());
        } else if (!checkSignatures(ctx.input_signature(), subprogramSignatures.get(ctx.ID(1).getText()))) {
            erors.add("Error: cant find such arguments in subprogram " + ctx.ID(1).getText());
        } else if (variables.get(ctx.ID(0).getText()) != null) {
            if (ctx.INT().size() != 1) {
                erors.add("Initialize error: Variable " + ctx.ID(0).getText() + " already used");
            } else if (!variables.get(ctx.ID(0).getText()).equalsIgnoreCase("int")) {
                erors.add("Initialize error: variable " + ctx.ID(0).getText() + " is not int");
            } else
                return "\t" + ctx.ID(0).getText() + "=" + ctx.ID(1).getText() + ctx.input_signature().getText() + ";";
        } else {
            if (!subprograms.get(ctx.ID(1).getText()).equalsIgnoreCase("int")) {
                erors.add("Cast error: subprogram " + ctx.ID(1).getText() + " is not int");
            } else {
                variables.put(ctx.ID(0).getText(), "int");
                return "\tint " + ctx.ID(0).getText() + "=" + ctx.ID(1).getText() + ctx.input_signature().getText() + ";";
            }
        }
        return "";
    }

    @Override
    public String visitCompare(EParser.CompareContext ctx) {
        String buf = "";
        String temp = ctx.simple_compare() != null ? visitSimple_compare(ctx.simple_compare()) : ctx.hard_compare() != null ? visitHard_compare(ctx.hard_compare()) : "";
        String temp2 = ctx.else_compare() != null ? visitElse_compare(ctx.else_compare()) : "";
        buf += "\tif(" + temp + ")" + visitBlock(ctx.block()) + temp2;
        return buf;
    }

    @Override
    public String visitSimple_compare(EParser.Simple_compareContext ctx) {
        String buf = "";
        if (ctx.EQUAL() != null)
            buf = "u.eq(" + ctx.getText().replace("==", ",") + ")";
        else if (ctx.NON_EQUAL() != null)
            buf = "u.not_eq(" + ctx.getText().replace("!=", ",") + ")";
        else if (ctx.LESS() != null)
            buf = "u.less(" + ctx.getText().replace("<", ",") + ")";
        else if (ctx.GREATER() != null)
            buf = "u.greater(" + ctx.getText().replace(">", ",") + ")";
        return buf;
    }

    @Override
    public String visitHard_compare(EParser.Hard_compareContext ctx) {
        return "!(" + visitSimple_compare(ctx.simple_compare()) + ")";
    }

    @Override
    public String visitElse_compare(EParser.Else_compareContext ctx) {
        String buf = "";
        buf += "\telse" + visitBlock(ctx.block());
        return buf;
    }

    @Override
    public String visitWhile_cicle(EParser.While_cicleContext ctx) {
        String buf = "";
        String temp = ctx.simple_compare() != null ? visitSimple_compare(ctx.simple_compare()) : ctx.hard_compare() != null ? visitHard_compare(ctx.hard_compare()) : "";
        buf += "\twhile(" + temp + ")" + visitBlock(ctx.block());
        return buf;
    }

    @Override
    public String visit(ParseTree tree) {
        String s = super.visit(tree) + matr + utils + "}";
        //  System.out.println(variables);
        String err = "";
        if (erors.size() > 0) {
            for (String string : erors)
                err += string + "\n";
            //return "";*/
            JOptionPane.showMessageDialog(null, err);
        }
        return s;
    }

    String matr =
            "public class Matrix {\n" +
                    "    public final int M;             // number of rows\n" +
                    "    public final int N;             // number of columns\n" +
                    "    public final double[][] data;   // M-by-N array\n" +
                    "\n" +
                    "    // create M-by-N matrix of 0's\n" +
                    "    public Matrix(int M, int N) {\n" +
                    "        this.M = M;\n" +
                    "        this.N = N;\n" +
                    "        data = new double[M][N];\n" +
                    "       /* for (double[] doubles: data)\n" +
                    "            for (double d:doubles)\n" +
                    "                d=1;*/\n" +
                    "    }\n" +
                    "\n" +
                    "    // create matrix based on 2d array\n" +
                    "    public Matrix(double[][] data) throws Exception {\n" +
                    "        M = data.length;\n" +
                    "        N = data[0].length;\n" +
                    "        this.data = new double[M][N];\n" +
                    "        try {\n" +
                    "            for (int i = 0; i < M; i++)\n" +
                    "                for (int j = 0; j < N; j++)\n" +
                    "                    this.data[i][j] = data[i][j];\n" +
                    "        } catch (Exception e){\n" +
                    "            throw new Exception(\"VariableInitializeError\");\n" +
                    "        }\n" +
                    "    }\n" +
                    "\n" +
                    "    // copy constructor\n" +
                    "    public Matrix(Matrix A) throws Exception { this(A.data.clone()); }\n" +
                    "\n" +
                    "    // return C = A + B\n" +
                    "\n" +
                    "    public Matrix to_vec() throws Exception {\n" +
                    "        double[][] d=new double[1][data[0].length];\n" +
                    "        d[0]=data[0].clone();\n" +
                    "        Matrix C=new Matrix(d);\n" +
                    "        return C;\n" +
                    "    }\n" +
                    "\n" +
                    "    @Override\n" +
                    "    public String toString() {\n" +
                    "        String s=\"\";\n" +
                    "        for (double[] doubles: data){\n" +
                    "            for (double d: doubles)\n" +
                    "                s+=d+\" \";\n" +
                    "            s+=\"\\n\";\n" +
                    "        }\n" +
                    "        return s;\n" +
                    "    }\n" +
                    "}";
    String utils =
            "public class MatrUtils {\n" +
                    "    public Matrix plus(Matrix A, Matrix B) {\n" +
                    "        if (B.M != A.M || B.N != A.N) throw new RuntimeException(\"Illegal matrix dimensions.\");\n" +
                    "        Matrix C = new Matrix(A.M, A.N);\n" +
                    "        for (int i = 0; i < A.M; i++)\n" +
                    "            for (int j = 0; j < A.N; j++)\n" +
                    "                C.data[i][j] = A.data[i][j] + B.data[i][j];\n" +
                    "        return C;\n" +
                    "    }\n" +
                    "\n" +
                    "    public Matrix get(Matrix A,int n) throws Exception {\n" +
                    "        double[][] t =new double[1][A.N];\n" +
                    "        t[0]=A.data[n].clone();\n" +
                    "        Matrix C = new Matrix(t);\n" +
                    "        return C;\n" +
                    "    }\n" +
                    "\n" +
                    "    // return C = A - B\n" +
                    "    public Matrix minus(Matrix A, Matrix B) {\n" +
                    "        if (B.M != A.M || B.N != A.N) throw new RuntimeException(\"Illegal matrix dimensions.\");\n" +
                    "        Matrix C = new Matrix(A.M,A.N);\n" +
                    "        for (int i = 0; i < A.M; i++)\n" +
                    "            for (int j = 0; j < A.N; j++)\n" +
                    "                C.data[i][j] = A.data[i][j] - B.data[i][j];\n" +
                    "        return C;\n" +
                    "    }\n" +
                    "\n" +
                    "    // does A = B exactly?\n" +
                    "    public boolean eq(Matrix A, Matrix B) {\n" +
                    "        if (B.M != A.M || B.N != A.N) throw new RuntimeException(\"Illegal matrix dimensions.\");\n" +
                    "        for (int i = 0; i < A.M; i++)\n" +
                    "            for (int j = 0; j < A.N; j++)\n" +
                    "                if (A.data[i][j] != B.data[i][j]) return false;\n" +
                    "        return true;\n" +
                    "    }\n" +
                    "    public boolean eq(int a, int b) {\n" +
                    "        return a==b;\n" +
                    "    }\n" +
                    "\n" +
                    "    // does A = B exactly?\n" +
                    "    public boolean not_eq(Matrix A, Matrix B) {\n" +
                    "        if (B.M != A.M || B.N != A.N) throw new RuntimeException(\"Illegal matrix dimensions.\");\n" +
                    "        for (int i = 0; i < A.M; i++)\n" +
                    "            for (int j = 0; j < A.N; j++)\n" +
                    "                if (A.data[i][j] != B.data[i][j]) return true;\n" +
                    "        return false;\n" +
                    "    }\n" +
                    "\n" +
                    "    public boolean not_eq(int A, int B) {\n" +
                    "        return A!=B ;\n" +
                    "    }\n" +
                    "    public boolean less(int A, int B) {\n" +
                    "        return A<B ;\n" +
                    "    }\n" +
                    "    public boolean greater(int A, int B) {\n" +
                    "        return A>B ;\n" +
                    "    }\n" +
                    "\n" +
                    "    // return C = A * B\n" +
                    "    public Matrix mult(Matrix A, Matrix B) {\n" +
                    "        if (A.N != B.M) throw new RuntimeException(\"Illegal matrix dimensions.\");\n" +
                    "        Matrix C = new Matrix(A.M, B.N);\n" +
                    "        for (int i = 0; i < C.M; i++)\n" +
                    "            for (int j = 0; j < C.N; j++)\n" +
                    "                for (int k = 0; k < A.N; k++)\n" +
                    "                    C.data[i][j] += (A.data[i][k] * B.data[k][j]);\n" +
                    "        return C;\n" +
                    "    }\n" +
                    "    // return C = A * n\n" +
                    "    public Matrix mult(Matrix A, double n) {\n" +
                    "        Matrix C = new Matrix(A.M, A.N);\n" +
                    "        for (int i = 0; i < C.M; i++)\n" +
                    "            for (int j = 0; j < C.N; j++)\n" +
                    "                    C.data[i][j] = A.data[i][j] *n ;\n" +
                    "        return C;\n" +
                    "    }\n" +
                    "}\n";
}
