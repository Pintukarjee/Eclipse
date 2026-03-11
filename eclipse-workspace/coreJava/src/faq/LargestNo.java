package faq;

public class LargestNo {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;
		
		if(a>b && a>c) {
			System.out.println("A = " + a + " " + "is the largest no.");
		} else if (b>c && b>a) {
			System.out.println("B = " + b + " " + "is the largest no.");
		} else {
			System.out.println("C = " + c + " " + "is the largest no.");
		}
		
		

	}

}
