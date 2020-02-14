package OldPapers;

public class Test {
	
	public static void main(String[] args) {
		double[] a = {1,2,3,4,5,6,7,8,9};
		double[] b = {1,2,5};
		ArrayUtilities g = new ArrayUtilities();
		System.out.println(g.indexOf(2, a));
		System.out.println(g.containsValue(2, a));
		System.out.println(g.isAbsDescending(a));
		System.out.println(g.containsDuplicates(a));
		System.out.println(g.containsArray(b,a));
	}

}
