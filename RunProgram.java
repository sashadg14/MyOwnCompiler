public class RunProgram {
    MatrUtils u = new MatrUtils();

    public static void main(String[] args) {
        try {
            new RunProgram().run();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    void run() throws Exception
{
	Matrix a = new Matrix(new double[][]{{1,2,3},{4,5,6},{7,8,9}});
	Matrix b = new Matrix(new double[][]{{1,2,3},{4,5,6},{7,8,9}});
	int p=2;
	System.out.println("matrix_a");
	System.out.println(a);
	System.out.println("matrix_b");
	System.out.println(b);
	Matrix res=qwe(a,p);
	System.out.println(res);
}

private Matrix qwe(Matrix d, int x) throws Exception {
	Matrix c = u.get(d,x);
return c;
}
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
}public class MatrUtils {
    public Matrix plus(Matrix A, Matrix B) {
        if (B.M != A.M || B.N != A.N) throw new RuntimeException("Illegal matrix dimensions.");
        Matrix C = new Matrix(A.M, A.N);
        for (int i = 0; i < A.M; i++)
            for (int j = 0; j < A.N; j++)
                C.data[i][j] = A.data[i][j] + B.data[i][j];
        return C;
    }

    public Matrix get(Matrix A,int n) throws Exception {
        double[][] t =new double[1][A.N];
        t[0]=A.data[n].clone();
        Matrix C = new Matrix(t);
        return C;
    }

    // return C = A - B
    public Matrix minus(Matrix A, Matrix B) {
        if (B.M != A.M || B.N != A.N) throw new RuntimeException("Illegal matrix dimensions.");
        Matrix C = new Matrix(A.M,A.N);
        for (int i = 0; i < A.M; i++)
            for (int j = 0; j < A.N; j++)
                C.data[i][j] = A.data[i][j] - B.data[i][j];
        return C;
    }

    // does A = B exactly?
    public boolean eq(Matrix A, Matrix B) {
        if (B.M != A.M || B.N != A.N) throw new RuntimeException("Illegal matrix dimensions.");
        for (int i = 0; i < A.M; i++)
            for (int j = 0; j < A.N; j++)
                if (A.data[i][j] != B.data[i][j]) return false;
        return true;
    }
    public boolean eq(int a, int b) {
        return a==b;
    }

    // does A = B exactly?
    public boolean not_eq(Matrix A, Matrix B) {
        if (B.M != A.M || B.N != A.N) throw new RuntimeException("Illegal matrix dimensions.");
        for (int i = 0; i < A.M; i++)
            for (int j = 0; j < A.N; j++)
                if (A.data[i][j] != B.data[i][j]) return true;
        return false;
    }

    public boolean not_eq(int A, int B) {
        return A!=B ;
    }
    public boolean less(int A, int B) {
        return A<B ;
    }
    public boolean greater(int A, int B) {
        return A>B ;
    }

    // return C = A * B
    public Matrix mult(Matrix A, Matrix B) {
        if (A.N != B.M) throw new RuntimeException("Illegal matrix dimensions.");
        Matrix C = new Matrix(A.M, B.N);
        for (int i = 0; i < C.M; i++)
            for (int j = 0; j < C.N; j++)
                for (int k = 0; k < A.N; k++)
                    C.data[i][j] += (A.data[i][k] * B.data[k][j]);
        return C;
    }
    // return C = A * n
    public Matrix mult(Matrix A, double n) {
        Matrix C = new Matrix(A.M, A.N);
        for (int i = 0; i < C.M; i++)
            for (int j = 0; j < C.N; j++)
                    C.data[i][j] = A.data[i][j] *n ;
        return C;
    }
}
}