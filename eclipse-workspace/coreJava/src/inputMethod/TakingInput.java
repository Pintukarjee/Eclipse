package inputMethod;

import java.util.Scanner;

public class TakingInput {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String name = scanner.next();
		
		System.out.println("Your age : ");
		int age = scanner.nextInt();
		
		System.out.println("Your city name : ");
		String city =  scanner.next();
		
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("City :" + city);
		
		System.out.println("Enter a unknown value: ");
		Object value = scanner.next();
		System.out.println(value);
		
		/*System.out.println("Enter a number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		
		System.out.println("The sum of two value is : " + (num1 + num2));
		*/
	}

}
