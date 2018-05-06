package practice.triangle.program;

import java.util.Scanner;

public class Triangle3 {
	
	
	/*
	 * 
	 * Take number from input..and print following triangle for that number of rows 
	 * 
	 {
		0
		11
		000
		1111
		00000
		111111
		0000000
	 }
	*/

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter the number");
		int nRow = s.nextInt();
		
		for (int i=0;i<nRow;i++)
		{	

			for (int j=0;j<=i;j++)
			{
				System.out.print(i%2);
			}System.out.println();
			
		}

	}

}
