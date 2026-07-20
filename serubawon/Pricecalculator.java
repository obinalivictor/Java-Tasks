// import scanner
// input price
// declare tax and total
// print total


import java.util.Scanner;
  public class Pricecalculator{
     public static void main(String[] args){
     
        Scanner input = new Scanner (System.in);
     
       System.out.println("enter price");
        int price = input.nextInt();
     
          double tax = price * 0.075; 
         double total = price + tax;
     
     System.out.printf("total = %.2f",total);
     
     
     
     
     
     }
  }
