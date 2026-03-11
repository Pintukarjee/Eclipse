package faq;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int a = 10, b = 20;

		System.out.println("Before swapping the value : " + a + " " + b);
/*
		int t = a; //10
		a = b; //20
		b = t; //10

		System.out.println("After swapping the value : " + a + " " + b);
		
		without using tamperer value 
		
		a = a+b; //10+20 = 30;
		b = a-b; //30-20 = 10;
		a = a-b; //30-10 = 20;
		
		System.out.println("After swapping the value using + & - : "+ a + " , " + b);
		
		// without using third variable
		
		a = a*b; //10*20 = 200;
		b = a/b; //200/20 = 10;
		a = a/b; //200/10 = 20;
		
		System.out.println("After swapping the value using * & / : "+ a + " , " + b);
		
		//using bitwise
		
		a = a^b; //10^20 = 30
		b = a^b; //30^20 = 10
		a = a^b; //30^10 = 20
		
		System.out.println("After swapping the value using bitwise operator : "+ a + " , " + b);
*/
		//using single statement
		
		b = a+b - (a=b); 
		//b = 10+20 - (a=20)
		//30 - 20
		//b = 10 ---> (a=b) ==>(a=20)
		
		System.out.println("After swapping the value using single statement : " + a + " , " + b);
	}

}
