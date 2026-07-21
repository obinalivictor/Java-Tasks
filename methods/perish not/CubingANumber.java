import java.util.Scanner;
public class CubingANumber{

public static int Cube(int a){

  int number = a*a*a;

return number;




}


      public static void main(String [] args){
      
      Scanner input = new Scanner (System.in);
      
      System.out.println("enter digit");
      int digit = input.nextInt();
       
      System.out.println(Cube(digit));
      }
}
