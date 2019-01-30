package array;

import java.util.Scanner;

public class MaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[10];
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Array element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
			
		}
		System.out.println("Max Element is");
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
         if(arr[i]>max)
         {
        	 max=arr[i];
         }
		}
		System.out.println(max);
	
	}

}
