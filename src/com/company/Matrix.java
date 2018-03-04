package com.company;

/**
 * Created by Alex on 28.01.2018.
 */
public class Matrix {
    public final int M;             // number of rows
    public final int N;             // number of columns
    public final double[][] data;   // M-by-N array

    // create M-by-N matrix of 0's
    public Matrix(int M, int N) {
        this.M = M;
        this.N = N;
        data = new double[M][N];
       /* for (double[] doubles: data)
            for (double d:doubles)
                d=1;*/
    }

    // create matrix based on 2d array
    public Matrix(double[][] data) throws Exception {
        M = data.length;
        N = data[0].length;
        this.data = new double[M][N];
        try {
            for (int i = 0; i < M; i++)
                for (int j = 0; j < N; j++)
                    this.data[i][j] = data[i][j];
        } catch (Exception e){
            throw new Exception("VariableInitializeError");
        }
    }

    // copy constructor
    public Matrix(Matrix A) throws Exception { this(A.data.clone()); }

    // return C = A + B

    public Matrix to_vec() throws Exception {
        double[][] d=new double[1][data[0].length];
        d[0]=data[0].clone();
        Matrix C=new Matrix(d);
        return C;
    }

    @Override
    public String toString() {
        String s="";
        for (double[] doubles: data){
            for (double d: doubles)
                s+=d+" ";
            s+="\n";
        }
        return s;
    }
}
