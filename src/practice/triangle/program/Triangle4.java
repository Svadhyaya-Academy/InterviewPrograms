package practice.triangle.program;

import java.util.Scanner;

public class Triangle4 {

	
	/*
	 * 
	 * Take number from input..and print following triangle for that number of rows 
	 * 
	 {
		       A
		      BA
		     CBA
		    DCBA
		   EDCBA
		  FEDCBA
		 GFEDCBA
		HGFEDCBA
	 }
	*/
	
	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("Please enter the number");
		int nRow = s.nextInt();
		
		for (int i=0;i<=nRow;i++)
		{	
		 
		  for(int j=i;j<nRow;j++)
          {
        	  System.out.print(" ");
          }
			
          for(int j=i+65;j>=65;j--)
          {
        	  System.out.print((char)j);
          }System.out.println();
			
			
		}

	}

}
