package SecondMavenPackage;

import java.util.ArrayList;

public class ArrayListSample {

	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Watermelon");
		list.add(0, "Lemon");
		System.out.println(list);
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Carrot");
		list.addAll(list1);
		System.out.println(list1);
		
		list.remove(0);
		System.out.println(list);
		list.removeAll(list1);
		System.out.println(list);
	}
}
