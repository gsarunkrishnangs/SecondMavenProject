package SecondMavenPackage;

public class SampleThrows {

	public static int divNum(int p, int q) {
		int div = p / q;
		return (div);
	}

	public static void main(String args[]) {
		SampleThrows obj = new SampleThrows();
		try {
			System.out.println(obj.divNum(15, 0));
		} catch (ArithmeticException e) {
			System.out.println("Number can not be divided by zero");
		}
		System.out.println("Executing remaining code");
	}
}
