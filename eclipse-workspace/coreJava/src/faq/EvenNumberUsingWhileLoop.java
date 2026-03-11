package faq;

public class EvenNumberUsingWhileLoop {

	public static void main(String[] args) {

		/*int number = 2;

		while (number <= 10) {
			System.out.println("Even numbers are : " + " " + number);
			number += 2; // number = number+2;
*/			
			//System.out.println("=============if statement============");
			int i = 1;
			
			while (i <= 10) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
				i++;
			}
		}
	}
