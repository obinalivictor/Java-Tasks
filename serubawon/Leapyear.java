// import scanner
//input amount of days in a year
// use if else statement to decide whether its a leap year





import java.util.Scanner;
  public class Leapyear{
  public static void main(String[] args){
  
  
      Scanner input = new Scanner (System.in);
  
  
    System.out.println("enter amount of days in the  year");
      int year   = input.nextInt();
  
  
   if(year % 4 == 0 && year % 100 != 0 && year % 400 == 0)
       System.out.println("leap year");
  
        else
  
  System.out.println("regular year");
  
  
  }
  }
