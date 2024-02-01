package SecondMavenPackage;

public class SampleException {
	public static void main(String args[]) {
		System.out.println("HelloWorld");
		/*String m = null;
		System.out.println(m.charAt(0));*/
		int a[] = {1,2,3};
		try {
		System.out.println(a[3]);
		}
		/*catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Length Exceeds"+e);
		}
		catch (Exception e) {
			System.out.println(e);
		}*/
		finally {
			System.out.println("Finally block");
		}
		/*int b = 20;
		try {
		System.out.println(b/0);
		}
		catch(Exception e) {
			System.out.println("division by zero is not possible");
		}*/
	}

}
