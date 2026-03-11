package iteratorDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			al.add(i);
		}
		System.out.println(al);

		// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

		Iterator<Integer> itr = al.iterator();

		while (itr.hasNext()) {
			Integer it = itr.next();
			System.out.print(it + " ");

			// 0 1 2 3 4 5 6 7 8 9

			if (it % 2 != 0) {
				itr.remove();
			}
		}
		System.out.println();
		System.out.println(al);

		// [0, 2, 4, 6, 8]
	}

}
