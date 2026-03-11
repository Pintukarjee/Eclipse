package array;

public class TwoOrMultiDArray {

	public static void main(String[] args) {
		// approach 1
		int a[][] = new int[3][2];
		/*
		 * int [] a[] = new int [3] [2]; 
		 * int [] []a = new int [3] [2];
		 */

		a[0][0] = 100;
		a[0][1] = 200;

		a[1][0] = 300;
		a[1][1] = 400;

		a[2][0] = 500;
		a[2][1] = 600;

		for (int r = 0; r <= 2; r++)
		{
			for (int c = 0; c <= 1; c++) 
			{
				System.out.print(a[r][c] + " ");
			}
			System.out.println();
		}
		
		//enhanced for loop OR for..each loop
		System.out.println("Enhanced for loop");
		
		for(int arr[] : a) {
			for (int x : arr)
			{
				System.out.print(x + "  ");
			}
			System.out.println();
		}

	}
}
