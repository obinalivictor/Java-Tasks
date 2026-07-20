// import scanner
// let user input number
// use if else to determine category of numbers




import java.util.Scanner;
  public class Traceselection{
     public static void main(String[] args){
     
     Scanner input = new Scanner (System.in);
     
     
       System.out.println("enter number");
          int number = input.nextInt();
     
     
     
        if(number > 20)
     System.out.println("BIG");
     
     else if (number > 10)
       System.out.println("medium");
     else
     System.out.printf("%d is a small number",number);
     
     
     
     
     
     }
  }
