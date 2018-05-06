package practice.triangle.program;

import java.util.Scanner;

public class Triangle1 {

	/*
	 * 
	 * Take number from input..and print following triangle for that number of rows 
	 * 
	 {
		*
		* *
		* * *
		* * * *
		* * * * *
		* * * * * *
		* * * * * * *
	 }
	*/

	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter the number");
		int nRow = s.nextInt();
		for (int i=1;i<=nRow;i++)
		{
			for (int j=1; j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}

}
