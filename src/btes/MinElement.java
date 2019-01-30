package array;

import java.util.Scanner;

public class MinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[5];
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Array element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
			
		}
		System.out.println("Min Element is");
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
         if(arr[i]<min)
         {
        	 min=arr[i];
         }
		}
		System.out.println(min);
	
	}

}

