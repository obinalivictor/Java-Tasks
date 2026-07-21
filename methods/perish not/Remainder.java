import java.util.Scanner;
public class Remainder{


public static int Modulus(int a,int b){

int divide = a % b;

return divide;




}



   public static void main(String[] args){
   Scanner input = new Scanner (System.in);
   
   System.out.println("enter a number");
   int numberOne = input.nextInt();
   
      System.out.println("enter a number");
   int numberTwo = input.nextInt();
   
   System.out.println(Modulus(numberOne,numberTwo));
   
   }
}
