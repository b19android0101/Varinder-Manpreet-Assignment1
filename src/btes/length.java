package btes;

import java.util.Scanner;

public class length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,len=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any no");
		x=s.nextInt();
		while(x>0)
		{
			len++;
			x=x/10;
		}
		System.out.println("lengeth the no is" +len);
		
		

	}

}
