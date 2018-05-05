package practice.interview.program;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {


		Scanner s= new Scanner(System.in);
		System.out.println("Please enter your number");
		int r; int chkNum=s.nextInt();
		int b=chkNum;
		int sum=0;
		while(b>0)
		{
			r= b%10;
			sum= sum+(r*r*r);
			b=b/10;
		}
		
		if(sum==chkNum)
			{
			System.out.println("Armstrong number");
			}
		else System.out.println("Not an Armstrong number");

	}

}
