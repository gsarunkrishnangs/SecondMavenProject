package SecondMavenPackage;

public class SampleThrow {

	public static void validate(int age) {
		if (age < 18) {
			throw new ArithmeticException("Person is not eligible");
		} else {
			System.out.println("Person is eligible");
		}
	}

	public static void main(String args[]) {
		validate(12);
		System.out.println("Execute remaining code");
	}
}
