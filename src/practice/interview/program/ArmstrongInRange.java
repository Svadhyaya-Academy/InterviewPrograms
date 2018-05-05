package practice.interview.program;

import java.util.Scanner;

public class ArmstrongInRange {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter the range");
		int range= s.nextInt();
		for (int i=1;i<=range;i++)
		{
		int r; int b=i;
		int sum=0;
		while(b>0)
		{
			r= b%10;
			sum= sum+(r*r*r);
			b=b/10;
		}
		
		if(sum==i)
			{
			System.out.println(i+" is a Armstrong number");
			}
		//else System.out.println("Not an Armstrong number");

	    }
	}

}
