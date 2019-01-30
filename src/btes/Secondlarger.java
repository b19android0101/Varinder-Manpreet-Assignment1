package array;

import java.util.Scanner;

public class Secondlarger {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[5];
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
         if(max==arr[i-1])
         {
        	 
         }
		}
		System.out.println(max);	     
	}

}
