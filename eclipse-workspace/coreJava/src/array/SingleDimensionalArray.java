package array;

public class SingleDimensionalArray {
	
	public static void main(String[] args) {
		//approach 1
		int a [] = new int [5];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
		
		for(int i =0; i<=a.length-1; i++)
		
		System.out.println(a[i]);
		
		//approach 2
		System.out.println("================");
		
		int b[] = {100,200,300,400,500};
		
		for (int p =0; p <b.length; p++)
			System.out.println(b[p]);
		
		/*for(int var : b) {
			System.out.println(var); 
		}
		*/
	}

}
