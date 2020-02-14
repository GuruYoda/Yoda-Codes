
public class Vector {
	private int n;
	private double[] z;
	
	public Vector(int n) {
		this.n = n;
		this.z = new double[this.n];
	}
	
	public Vector(double... z) {
		this.z = z;
	}
	
	public double getz(int id) {
		return this.z[id];
	}
	
	public void setz(int id, double v) {
		this.z[id] = v;
	}
	
	public int lengthV() {
		return this.z.length;
	}
	
	public void printV(Vector z) {
		for (int i = 0 ; i < z.lengthV() ; i++) {
			System.out.print(z.getz(i) + " ");
		}
	}
	
	public static void main(String[] args) {
		
		Vector z = new Vector(1,2,3,4);
		z.printV(z);
	}

}
