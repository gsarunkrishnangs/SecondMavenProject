package SecondMavenPackage;
//TryCatchExample
public class SampleProject {
public static void main(String args[]) {
	System.out.println("HelloWorld");
	/*String m = null;
	System.out.println(m.charAt(0));
	int a[] = {1,2,3};
	System.out.println(a[3]);*/
	int b = 20;
	try {
	System.out.println(b/0);
	}
	catch(Exception e) {
		System.out.println("division by zero is not possible");
	}
}
}
