package faq;

public class CountDuplicate {

	public static void main(String[] args) {
		int number[] = {100, 200, 100, 300, 400, 100, 500, 100};
		int target_Number = 100;
		int count = 0;
		
		for (int val : number)
		{
			if (val == target_Number)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
