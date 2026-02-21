package CollectionFramework;

import java.util.ArrayList;

public class ArrayListExp {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		l.add("A");
		// l.add(10);
		l.add("A");
		l.add(null);
		System.out.println(l); // [A, 10, A, null ]
		l.remove(2);
		System.out.println(l); // [A, 10, null]
		l.add("m");
		l.add("N");
		System.out.println(l); // [ A, 10, m, null, N]
	}

}
