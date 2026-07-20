import java.util.Scanner;
 public class Loop2{
 public static void main(String[] args){
 
    Scanner input = new Scanner (System.in);
 




int total = 0;
 int count = 0;
   while (count < 10){
   System.out.print("enter sum");
   int sum = input.nextInt();
     total =  total+ sum;
     count =count +1;
  }    System.out.println("total = "+total);
   
   
   
   }
   }
