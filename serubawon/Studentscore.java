// import scanner
// input grade from user
// declare variable gradescaled
// gradescaled is grade * 50/100


import java.util.Scanner;
public class Studentscore{
   public static void main(String[] args){
   
       Scanner input = new Scanner (System.in);
   
   System.out.println("enter grade");
      int grade = input.nextInt();
   
 int  gradescaled = grade * 50 /100;
   
        System.out.printf("grade =  %d  %n gradescaled = %d",grade,gradescaled);
   
   }
}
