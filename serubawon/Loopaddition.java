//import scanner
// initialise total as 0
//loop condition is as long as number is not zero continue asking for number 
// total equals to overall number entered


import java.util.Scanner;
public class Loopaddition{
   public static void main(String[] args){
   
   Scanner input = new Scanner (System.in);
   
   int total = 0;
   
   System.out.println("enter integer");
     int number = input.nextInt();
   
   while(number != 0){
   
   
   System.out.println("enter integer");
     number = input.nextInt();
   
   total = total + number;
 }
    System.out.println(total);
   
   }
}
