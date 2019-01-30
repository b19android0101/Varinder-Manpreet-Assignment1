package array;

import java.util.Scanner;

public class Array2d {
	public static void main(String[] args) {
		int[][] arr= new int[3][4];
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Array element");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=s.nextInt();
			}
		} 
		for(int i=0;i<arr.length;i++)
	    {
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
		
	    	System.out.println();
	    }
	
	}
}
