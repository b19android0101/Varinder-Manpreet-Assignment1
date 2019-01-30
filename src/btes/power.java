package btes;

import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pwr=1;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number");
        int n=in.nextInt();
        System.out.println("Enter power");
        int p=in.nextInt();
		for(int i=1;i<=p;i++)
		{
			pwr=pwr*n;
		}
		System.out.println("pwr is="+pwr);

	}

	}


