import java.util.Scanner;
public class integerdivisibility{
   public static void main(String[] args){
   
   
     Scanner input = new Scanner (System.in);
     
     
     System.out.println("enter number");
       int number = input.nextInt();
     
     
     if(number % 3 == 0 && number % 5 == 0)
     
        System.out.println("divisible by 3 and 5");
     
         else if (number % 3 == 0 && number % 5 != 0)
           System.out.println("divisible by 3 only");
     
        else if (number % 5 == 0 && number % 3 != 0)
       System.out.println("number is divisible by 5 only");
     
     else if(number % 3 != 0 && number % 5 != 0)
     
     System.out.println("number is divisible by neither");
     
    }
     }
