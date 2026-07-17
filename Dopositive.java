// import scanner
// enter a number
//while number is greater than zero print


import java.util.Scanner;
  public class dopositive{
      public static void main(String[] args){
      int count = 1;
     int positive = 0;
       Scanner input = new Scanner (System.in);
      
      do{
      
      System.out.println("enter number");
        int number = input.nextInt();
      
      if(number > 0)
  positive = number ;
      
      count++;}
      
      System.out.println(positive);
      while(count <= 10);
      
      
      }
  }
