package stringMethods;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

		// 1> length();

		String name = "sriya";
		// String name = new String("sriya");

		System.out.println(name.length());
		System.out.println();
		// System.out.println("sriya".length());

		// 2> trim();
		String s = "   pintu   ";
		System.out.println(s);
		System.out.println(s.trim());
		System.out.println();

		// 3> concat();

		String s1 = "sri", s2 = "ya",

				s3 = "pin", s4 = "tu";

		System.out.println(s1.concat(s2));
		System.out.println(s1 + s2);
		System.out.println(s1.concat(s2) + s3.concat(s4));
		System.out.println(s1 + s2 + s3 + s4);
		System.out.println();

		// 4> contains();
		String word = "welcome";

		System.out.println(word.contains("come"));
		System.out.println(word.contains(s1));
		System.out.println();

		// 5> equals() and equalsIgnoreCase() ;
		String m1 = "Hello";
		String m2 = "hello";
		
		System.out.println("======EQUALS=====");
		System.out.println(m1.equals(m2));
		System.out.println();
		
		System.out.println("======EQUALS IGNORE CASE======");
		System.out.println(m1.equalsIgnoreCase(m2));
		System.out.println();

		// 6> replace();
		String amount = "$35,00,00";
		System.out.println("after replace $ and ,  : " + amount.replace("$", "").replace(",", ""));
		System.out.println();
		
		// 7> substring();
		String su = "sriyank";
		
		System.out.println("----SUBSTRING----");
		System.out.println(su.substring(3,7)); //yank
		System.out.println();
		
		
		// 8> toUpperCase and toLowerCase();
		String n1 = "sriya";
		
		System.out.println("====== TO UPPERCASE ======");
		System.out.println(n1.toUpperCase());
		System.out.println();
		
		String n2 = "SRIYA";
		
		System.out.println("====== TO LOWERCASE ======");
		System.out.println(n2.toLowerCase());
		System.out.println();
		
		// 9> split();
		String email = "pintukarjee2@gmail.com";
		
		String [] afterSplit = email.split("@");
		System.out.println(Arrays.toString(afterSplit));
		
		//Note : " * % ^ ( ) " ---> cannot use as delimiter.
	}

}
