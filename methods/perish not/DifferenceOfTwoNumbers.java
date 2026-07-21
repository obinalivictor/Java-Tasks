import java.util.Scanner;
public class DifferenceOfTwoNumbers{


public static int Subtraction(int a,int b){


int subtract = a - b;

return subtract;







}











     public static void main(String [] args){
     Scanner input = new Scanner (System.in);
     
     System.out.println("enter number");
     int numberOne = input.nextInt();
     
      System.out.println("enter number");
     int numberTwo = input.nextInt();
     
     System.out.println(Subtraction(numberOne,numberTwo));
     
     }
}
