import java.util.Scanner;
public class SumOfTwoNumbers{

public static int Add(int a,int b){

int sum = a + b;
return sum;




}









     public static void main(String[] args){
     
     Scanner input = new Scanner (System.in);
     
     
     System.out.println("enter number");
     int numberOne = input.nextInt();
     
       System.out.println("enter number");
     int numberTwo = input.nextInt();
     
   System.out.println(Add(numberOne,numberTwo));
     
     
     }
}
