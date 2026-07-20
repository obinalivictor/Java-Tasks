//import scanner
// input two integer
// declare sum ,difference,productand quotient
// print each on a different line


import java.util.Scanner;
   public class SumProductDifferenceOfnumber{
     public static void main(String[] args){
     
       Scanner input = new Scanner (System.in);
     
        System.out.println("enter integer");
            int numberOne = input.nextInt();
     
           System.out.println("enter integer");
               int numberTwo = input.nextInt();
     
     
     int sum = numberOne + numberTwo;
       int difference = numberOne - numberTwo;
     int product = numberOne * numberTwo;
        int quotient = numberOne / numberTwo;
     
     
     
     System.out.printf("sum = %d %ndifference = %d %nproduct = %d %nquotient = %d",sum,difference,product,quotient);
     
     
     
     
     }
   }
