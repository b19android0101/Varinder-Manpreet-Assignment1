package btes;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,i;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number");
	    n=in.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even:"+i);
			}
			else
			{
				System.out.println("Odd:"+i);
			}
				
		}
		

	}

}
