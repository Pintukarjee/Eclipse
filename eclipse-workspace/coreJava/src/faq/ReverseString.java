package faq;

public class ReverseString {
	public static void main(String[] args) {

		String s = "welcome";
		String rev = "";

		// approach 1 length() and charAt();

		/*
		 * for (int i = s.length() - 1; i >= 0; i--) 
		 * { 
		 * rev = rev + s.charAt(i); 
		 * }
		 * 
		 * System.out.println("reverse string is : " + rev); }
		 */

		// approach 2
		// without using string method

		char a[] = s.toCharArray();

		for (int i = a.length - 1; i >= 0; i--) {
			rev = rev + a[i];
		}
		System.out.println(rev);

		// approach 3
		// using StringBuffer()

		StringBuffer p = new StringBuffer("welcome");

		System.out.println("using StringBuffer : " + p.reverse());

		// approach 4
		// using StringBuilder()

		StringBuilder m = new StringBuilder("welcome");

		System.out.println("using StringBuilder : " + m.reverse());

	}
}
