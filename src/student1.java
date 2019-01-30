import java.io.*;
public class student1 {
	 
	    String name;
	    int rollno;
	    char grade;
	    double eng_marks,math_marks,sci_marks,total_marks,aver;
	    BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
	    student1()throws IOException
	    {
	        System.out.println("Enter roll_no.");
	        rollno=Integer.parseInt(s.readLine());;
	        System.out.println("Enter name");
	        name=s.readLine();
	        System.out.println("Enter eng_marks");
	        eng_marks=Double.parseDouble(s.readLine());
	        System.out.println("Enter math_marks");
	        math_marks=Double.parseDouble(s.readLine());
	        System.out.println("Enter sci_marks");
	        sci_marks=Double.parseDouble(s.readLine());
	        
	     }
	    void cal_total()
	    {
	      total_marks=(int) (eng_marks+math_marks+sci_marks);	
	    }
	    void cal_average()
	    {
	    	 aver=(int) (eng_marks+math_marks+sci_marks)/3;
	    }
	    void find_grade()
	    {
	    	 if(aver>=85)
	    	   {
	    	   System.out.println("Excellent");
	    	   }
	    	  else if(aver>=70 && aver<85 )
	    	   {
	    	   System.out.println("Very Good");
	    	   }
	    	   else if(aver>=50 &&aver<70)
	    	   {
	    	   System.out.println("Good");
	    	   }
	    	  else if(aver>=40 && aver<50)
	    	   {
	    	   System.out.println("Average");
	    	   }
	    	   else
	    	   {
	    	    System.out.println("Fail");
	    	   }
	    	
	    }
	    
	    void display()
	    {
	    	System.out.println("Total_Marks"+total_marks);
	    	System.out.println("Average"+aver);
	    	System.out.println("grade");
	    }
		public static void main(String[] args)throws IOException
	    {
	        student1 s1=new student1();
	        System.out.println("student1");
	        s1.cal_total();
	          s1.cal_average();
	          s1.display();
	          s1.find_grade();
	          student1 s2=new student1();
		      System.out.println("student2");
		        s2.cal_total();
		          s2.cal_average();
		          s2.display();
		          s2.find_grade();
		       student1 s3=new student1();
			   System.out.println("student3");
			        s3.cal_total();
			        s3.cal_average();
			        s3.display();
			        s3.find_grade();
	  }

}
