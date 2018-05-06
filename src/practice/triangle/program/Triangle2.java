package practice.triangle.program;

import java.util.Scanner;

public class Triangle2 {
	
	/*
	 * 
	 * Take number from input..and print following triangle for that number of rows 
	 * 
	 {
		1
		01
		101
		0101
		10101
		010101
		1010101
	 }
	*/

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter the number");
		int nRow = s.nextInt();
		
		for (int i=1;i<=nRow;i++)
		{	
			for (int j=i;j>=1;j--)
			{
				System.out.print(j%2);
			}System.out.println();
			
		}
		

	}

}
