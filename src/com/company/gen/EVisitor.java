package com.company.gen;// Generated from C:/Users/Alex/IdeaProjects/untitled/src\E.g4 by ANTLR 4.7

import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(EParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(EParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(EParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#digit_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit_expression(EParser.Digit_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(EParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#input_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_signature(EParser.Input_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#assign_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_int(EParser.Assign_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#assign_int_by_subprogram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_int_by_subprogram(EParser.Assign_int_by_subprogramContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#programm_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramm_call(EParser.Programm_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#assign_vec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_vec(EParser.Assign_vecContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#assign_vec_by_subprogram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_vec_by_subprogram(EParser.Assign_vec_by_subprogramContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#set_vec_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_vec_expr(EParser.Set_vec_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#set_vec_expr_by_mat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_vec_expr_by_mat(EParser.Set_vec_expr_by_matContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#assign_mat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_mat(EParser.Assign_matContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#set_mat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_mat(EParser.Set_matContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#set_mat_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_mat_expr(EParser.Set_mat_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#get_mat_row_by_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_mat_row_by_id(EParser.Get_mat_row_by_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#print_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_number(EParser.Print_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#print_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_id(EParser.Print_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#print_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_string(EParser.Print_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#print_mat_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_mat_row(EParser.Print_mat_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#simple_compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_compare(EParser.Simple_compareContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#hard_compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHard_compare(EParser.Hard_compareContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#else_compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_compare(EParser.Else_compareContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#while_cicle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_cicle(EParser.While_cicleContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(EParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(EParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature(EParser.SignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#subprogram_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_return(EParser.Subprogram_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#subprogram_non_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_non_return(EParser.Subprogram_non_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#block_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_return(EParser.Block_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#block_non_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_non_return(EParser.Block_non_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link EParser#global_program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_program(EParser.Global_programContext ctx);
}