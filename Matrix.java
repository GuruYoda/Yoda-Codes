
public class Matrix {
	
	private double[][] M;
	private int n;
	
	public Matrix(int n) {
		this.n = n;
		this.M = new double[this.n][this.n];
	}
	
	public void setM(int id1 , int id2 , double m) {
		this.M[id1][id2] = m;
	}
	
	public double getM(int id1 , int id2) {
		return this.M[id1][id2];
	}
	
	public int lengthM() {
		return this.M.length;
	}
	
	public Matrix(int n , double... m) {
		this(n);
		for(int i = 0 ; i<n ; i++) {
			for (int j = 0 ; j<n ; j++) {
				this.setM(i, j, m[this.n * i + j]);
			}
		}
	}
	
	public void printM(Matrix M) {
		for(int i = 0 ; i < M.lengthM() ; i++) {
			for(int j = 0 ; j < M.lengthM() ; j++) {
				System.out.print(M.getM(i, j) + "  ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Matrix M = new Matrix(2,3,4,5,6);
		M.printM(M);
	}

}
