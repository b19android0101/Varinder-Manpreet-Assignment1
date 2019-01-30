import java.util.Scanner;
class Marriage
{
public static void main(String args[])
{
String g;
int age;
   Scanner in=new Scanner(System.in);
   System.out.println("Enter Gender:");
   g=in.nextLine();
   System.out.println("Enter AGE:");
   age=in.nextInt();
   if(g.equals("Male") || g.equals("M") && age>=21 )
   {
   System.out.println("Eligible for Marriage");
   }
   else if (g.equals("female")||g.equals("F") && age>=18)
   {
      System.out.println("Eligible for Marriage");
   }
    else 
   {
      System.out.println("Not eligible");
   }
}
}