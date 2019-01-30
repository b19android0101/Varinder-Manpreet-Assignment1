package array;

import java.util.Scanner;

public class reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[10];
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Array element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
			
		}
		System.out.println("Array Elements Are");
		for(int i=arr.length-1;i>=0;i--)
		{
		System.out.println(arr[i]);
	}
	}

}


