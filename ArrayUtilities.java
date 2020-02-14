package OldPapers;

import java.util.Arrays;

public class ArrayUtilities {
		
	public ArrayUtilities() {
		
	}
	
	public static int indexOf(double v , double[] x) {
		for(int i = 0 ; i < x.length ; i++) {
			if(x[i] == v) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static boolean containsValue (double v , double[] x) {
		for(int i =0 ; i < x.length ; i++) {
			if(x[i] == v) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isAbsDescending(double[] x) {
		for(int i = 0 ; i < x.length-1 ; i++) {
			if(Math.abs(x[i]) >= Math.abs(x[i+1])) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean containsDuplicates(double[] x) {
		for(int i =0 ; i < 1 ; i++) {
			for(int j = i ; j < x.length ; j++) {
				if(x[i] == x[j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean containsArray(double[] x, double[] y) {
		int n = x.length;
		int m = y.length;
		int i=0,j=0;
		while(i<n && j<m) {
			if(x[i]== y[j]) {
				i++;
				j++;
				if(i == n) {
					return true;
				}
			}
			else {
				i = i - j + 1;
				j=0;
			}
		}
		return false;
	}
	
	public static int firstIndexOf(double v, double[] x) {
		for(int i = 0 ; i<x.length ; i++) {
			if(x[i] == v) {
				return i;
			}
		}
		return -1;
	}
	
	public static int lastIndexOf(double v, double[] x) {
		for(int i = x.length-1 ; i > 0 ; i--) {
			if(x[i] == v) {
				return i;
			}
		}
		return -1;
	}
	
	public static boolean isNotDescending(double[] x) {
		for(int i = 0 ; i < x.length ; i++) {
			if(x[i] < x[i+1]) {
				return true;
			}
		}
		return false;
	}
	
	public static void replaceAll(double a, double b, double[] x) {
		for(int i = 0 ; i < x.length ; i++) {
			if(x[i] == a) {
				x[i] = b;
			}
		}
		System.out.println(Arrays.toString(x));
	}
	
	public static double[] concat(double[] x, double[] y, double[] z) {
		double[] m = new double[x.length+y.length+z.length];
		for(int i = 0 ; i < x.length ; i++) {
			m[i] = x[i];
		}
		for(int i = x.length ; i < x.length+y.length ; i++) {
			m[i] = y[i-x.length];
		}
		for(int i = x.length+y.length  ; i < x.length+y.length+z.length ; i++ ) {
			m[i] = z[i-x.length-y.length];
		}
		
		return m;
	}
	
	public static double oneNorm(double[] x) {
		double sum = 0;
		for(int i =0 ; i<x.length ; i++) {
			sum += Math.abs(x[i]);
		}
		return sum;
	}
	
	public static double infNorm(double[] x) {
		double a=0;
		for(int i = 0 ; i < x.length-1 ; i++) {
			if(x[i+1] > x[i]) {
				a = x[i+1];
			}
		}
		return a;
	}
	
	public static boolean isAscending(double[] x) {
		for(int i = 0 ; i < x.length-1 ; i++) {
			if(x[i] <= x[i+1]) {
				return true;
			}
		}
		return false;
	}
	
	public static double minValue(double[] x) {
		double a = 0;
		for(int i = 0 ; i < x.length-1 ; i++) {
			if(x[i+1] < x[i]) {
				a = x[i+1];
			}
		}
		return a;
	}
	
	public static int minIndex(double[] x) {
		int a = 0;
		for(int i = 0 ; i < x.length-1 ; i++) {
			if(x[i+1] < x[i]) {
				a= i+1;
			}
		}
		return a;
	}
	
	public static double mean(double[] x) {
		double sum = 0;
		for(int i = 0 ; i < x.length ; i++) {
			sum += x[i];
		}
		return sum = sum/x.length;
	}
	
	public static void variance(double[] x) {
		double m = 0;
		for(int i = 0 ; i < x.length ; i++) {
			m += x[i];
		}
		m = m/x.length;
		double var = 0;
		for(int i =0; i < x.length ; i++) {
			var += Math.pow(2, x[i]-m);
		}
		System.out.println(var);
	}
	
	public static boolean compare(int[] x, int[] y) {
		if(x.length == y.length) {
			for(int i =0 ; i < x.length ; i++) {
				if(x[i] == y [i]) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static void reverse(double[] x) {
		double[] a = new double[x.length];
		for(int i = x.length-1 ; i >= 0 ; i--) {
			a[i] = x[i];
		}
		System.out.println(Arrays.toString(a));
	}
	
}
