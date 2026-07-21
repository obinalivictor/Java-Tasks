import java.util.Scanner;
public class HalvingANumber{


public static double Divide(double a){

  double number = a / 2;

return number;

}





     public static void main(String [] args){
     Scanner input = new Scanner (System.in);
     
     System.out.println("enter integer");
     int digit = input.nextInt();
     
     System.out.println(Divide(digit));
     }
}
