import java.util.Scanner;
public class SimpleInterest{
public static void main(String[] args){

    Scanner input =new Scanner (System.in);

    System.out.println("enter principal");
     double principal = input.nextDouble();

   System.out.println("enter rate");
    double rate = input.nextDouble();

   System.out.println("enter time");
    double time = input.nextDouble();


     double  interest = principal * rate *time /100;
     double totalamount = principal + interest;

// initiate variable principal,rate,time 
//interest is principal*rate*time divided by 100
//total amount is principal + interest
   System.out.println("interest="+interest);
   System.out.println("totalamount="+totalamount);
}
}
