import java.util.Scanner;
   public class Operationcode{
   public static void main(String[] args){
   
   
     Scanner input = new Scanner (System.in);
   
   System.out.println("enter number");
    double numberOne = input.nextDouble();
   
   System.out.println("enter number");
    double numberTwo = input.nextDouble();
   
   
   System.out.println("enter operation(+,-,/,*)");
    char operation = input.next().charAt(0);
   
   
   if(operation == '+'){
      System.out.println("result =  "+(numberOne + numberTwo));
   
   } else if(operation == '-'){
       System.out.println("result =  "+(numberOne - numberTwo));
   
   
   } else if(operation == '*'){
       System.out.println("result =  "+(numberOne * numberTwo));
   
   
   } else if(operation == '/'){
           if(numberTwo != 0)     
      System.out.println("result =  "+(numberOne / numberTwo));
   
        
   } else 
   
       System.out.println("cannot divide by zero");
   
   
   
   
   
   
   
   
   
   
   
   
   
   }
   }
