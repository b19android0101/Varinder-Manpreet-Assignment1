import java.util.Scanner;
class Marriagechar
{
public static void main(String args[])
{
char g;
int age;
   Scanner in=new Scanner(System.in);
   System.out.println("Enter Gender:");
   g=in.nextLine().charAt(0);
   System.out.println("Enter AGE:");
   age=in.nextInt();
   if(g=='M' && age>=21 )
   {
   System.out.println("Eligible for Marriage");
   }
   else if (g=='F' && age>=18)
   {
      System.out.println("Eligible for Marriage");
   }
    else 
   {
      System.out.println("Not eligible");
   }
}
}