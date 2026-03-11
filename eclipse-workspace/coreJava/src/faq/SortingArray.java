package faq;

import java.util.Arrays;

public class SortingArray {
	public static void main(String[] args) {
		
		int a[] = {100, 600, 300, 200, 400, 500};
		
		System.out.println("Befor sorting arrays : " + Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println("After sorting arrays : " + Arrays.toString(a));
	}

}
