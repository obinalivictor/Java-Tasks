import java.util.Scanner;
public class LoopOriginal{
     public static void main(String[] args){
     
        Scanner input = new Scanner (System.in);
     
       int total = 0;
     int gradeCounter = 1;
     
     while(gradeCounter <= 10)
     {
       System.out.println("enter grade");
     int grade = input.nextInt();
     
       total = total + grade;
     gradeCounter = gradeCounter + 1;
     
     }
     System.out.println("total grade"+total);
     
     
     
     
     
     
     
     
     
     }
}
