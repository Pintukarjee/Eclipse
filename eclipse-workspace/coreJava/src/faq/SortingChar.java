package faq;

import java.util.Arrays;

public class SortingChar {
	public static void main(String[] args) {
		
		char s[] = {'S', 'R', 'I', 'Y', 'A'};
		//String s[] = {"PINTU", "SRIYA", "DEVERCHETTY", "KARJEE"};
		System.out.println("Befor sorting : " + Arrays.toString(s));
		Arrays.sort(s);
		
		System.out.println("After sorting : " + Arrays.toString(s));

	}
}
