package btes;

import java.util.Scanner;

public class fibonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fib,a=0,b=1,i;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number");
		int n=in.nextInt();
		System.out.print(a+" "+b+" ");
		for(i=1;i<=n;i++)
		{
			fib=a+b;
			a=b;
			b=fib;
			System.out.print(fib+" ");
		}
		

	}

	}


