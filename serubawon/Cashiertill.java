// import scanner
//use scanner to collect variable price and quantity
// declare subtotal,vat,and grandtotal and calculate their value then print grandtotal






import java.util.Scanner;
  public class Cashiertill{
      public static void main(String[] args){
      
         Scanner input = new Scanner (System.in);
      
      System.out.println("enter item price");
          double price = input.nextDouble();
      
      
        System.out.println("enter quantity");
          double quantity = input.nextDouble();   
      
      
      double subtotal = price * quantity;
      
      
      double vat = subtotal * 0.20;
      
      double grandtotal = subtotal + vat;
      
      System.out.printf("grandtotal =  %.2f ",grandtotal);
      
      }
  }
