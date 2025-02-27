import java.util.*;
public class GradeCalculator{
    public static void main(String args[]){                            //Task-2: Student Grade Calculator
      Scanner A=new Scanner(System.in);      
      System.out.print("Enter the number of Subjects: ");
      int n=A.nextInt();float total=0;
      int a[]=new int[n];
      System.out.println("Enter your Marks: ");
      for(int i=0;i<n;i++){
      System.out.print("Subject "+(i+1)+" :");
      a[i]=A.nextInt();
      total=total+a[i];
      }
      float Avg_Grade=total/(float)n;
      System.out.println("Total Marks Obtained by the student: "+(int)total+"/"+(n*100));
      System.out.println("Average percentage of the student: "+Avg_Grade+"%");

        if(Avg_Grade>90)
          System.out.println("Grade of the Average Percentage : O");
          
        else if(Avg_Grade>80)
          System.out.println("Grade of the Average Percentage : A+");
       
        else if(Avg_Grade>75)
        System.out.println("Grade of the Average Percentage : A");
        
        else if(Avg_Grade>70)
          System.out.println("Grade of the Average Percentage : B+");
          
        else if(Avg_Grade>60)
          System.out.println("Grade of the Average Percentage : B");
        
        else if(Avg_Grade>=50)
        System.out.println("Grade of the Average Percentage : C");
        
        else 
        System.out.println("Grade of the Average Percentage : F");
      }    
}


