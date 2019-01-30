package btes;
import java.util.Scanner;
public class primeno {
	public static void main(String[] args) {
    int n;
	Scanner in=new Scanner(System.in);
	boolean flag =true;
	System.out.println("Enter any number");
    n=in.nextInt();
	for(int i=2;i<n;i++)
		if(n%i==0)
		{
			flag=false;
			break;
		}
	if(flag==false)
	{
		 System.out.println("not prime");
	}
	else
	{
		 System.out.println("prime");
		
	}
	
			
	
	}
}
