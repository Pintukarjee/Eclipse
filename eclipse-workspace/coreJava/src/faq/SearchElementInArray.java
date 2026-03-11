package faq;

public class SearchElementInArray {
	public static void main(String[] args) {
		
		int a [] = {10,20,30,40,50};
		int searchElement = 30;
		
		boolean status = false;
		
		/*
		for (int i = 0; i <= a.length-1; i++) 
		{
			if (a[i] == searchElement) 
			{
				System.out.println("Element found." + a[i]);
				status = true;
				break;
			}
		}
		*/
		
		for (int x : a)
		{
			if (x == searchElement)
			{
				System.out.println("Element found.");
				status = true;
				break;
			}
		}
		
		if (status == false)
		{
			System.out.println("Element not found.");
		}
	}

}
