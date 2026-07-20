// import scanner
// input age as a variable
//use if else statement to determine which categories each age falls in





import java.util.Scanner;
public class Personsage{
   public static void main(String[] args){
   
      Scanner input = new Scanner (System.in);
   
   System.out.println("enter age");
      int age = input.nextInt();
   
   
   if(age < 13)
    System.out.println("child");
   
      else if (age >= 13 && age <= 17)
       System.out.println("teenager");
   
       else if(age >= 18 && age <= 64)
      System.out.println("adult");
   
   
       else if (age > 65)
   
     System.out.println("senior");
   
   
   
   
   }
}
