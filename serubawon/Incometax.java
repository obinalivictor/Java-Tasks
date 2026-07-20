//import scanner
// input income
// use if statement to get the te tax owed



import java.util.Scanner;
public class Incometax{
   public static void main(String[] args){
   
   
     Scanner input = new Scanner (System.in);
   
   System.out.println("enter income");
     int income = input.nextInt();
   
     
     if(income <= 300000){
     int taxowed = 300000 * 0/100;
      System.out.printf("taxowed = %d",taxowed);
     }
   
   
  else if(income >= 300001 && income <= 600000){
      int taxowed = income * 7 / 100;
     System.out.printf("taxowed = %d",taxowed);
   }
    
  else  if(income > 600000){
    int taxowed = income * 15 / 100;
     System.out.printf("taxowed = %d",taxowed);
    }
    
   
   
   }
}
