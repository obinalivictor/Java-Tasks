//  import scanner
//declare and initialise variable miles and collect input from user
// convert miles to kilometer
//print both variables


import java.util.Scanner;
   public class Kilometerconverter{
     public static void main(String[] args){
     
        Scanner input = new Scanner (System.in);
     
     System.out.println("enter distance");
         double miles = input.nextDouble();
     
     double kilometer = 1.60934 * miles;
     
     System.out.printf("miles = %.2f %n kilometer = %.2f",miles,kilometer);
     
     }
   }
