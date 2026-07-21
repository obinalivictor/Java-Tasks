import java.util.Scanner;
public class DecimalDivision{

  public static double Division(int a,int b){
  
  int divide = a / b;
  
  return divide;
  
  
  
  }




   public static void main(String [] args){
   
   Scanner input = new Scanner (System.in);
   
   System.out.println("enter a number");
   int numberOne = input.nextInt();
   
   
   System.out.println("enter a number");
   int numberTwo = input.nextInt();
   
   System.out.println(Division(numberOne,numberTwo));
   
   }
}
