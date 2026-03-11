package faq;

public class EvenOdd {
	public static void main(String[] args) {
		
		int number = 1;
		
		while (number <= 10) {
			if (number % 2 == 0)
			System.out.println(number + " " + "even number.");
			else {
				System.out.println(number + " " + "odd number.");
			}
			number++;
		}
	}

}
