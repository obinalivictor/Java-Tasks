import java.util.Scanner;
public class DivisibleByThree{

public static boolean Divisible(int a){

 int number = a;
 
  if(number % 3 == 0){
  return true;
  }
   return false;

}






   public static void main(String[] args){
   Scanner input = new Scanner (System.in);
   
   System.out.println("enter number");
   int digit = input.nextInt();
   
   System.out.println(Divisible(digit));
   }
}
