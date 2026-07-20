import java.util.Scanner;
public class Paycal{
public static void main(String[] args){

    Scanner input = new Scanner (System.in);

    System.out.println("enter hours worked");
      double hoursworked = input.nextDouble();

    System.out.println("hourly rate");
      double rate = input.nextDouble();

       System.out.println("enter bonus");
        double bonus = input.nextDouble();

       System.out.println("taxrate");
       double taxrate= input.nextDouble();


     double grosspay = hoursworked * rate + bonus;
      double taxamount = grosspay * taxrate /100;
      double netpay = grosspay - taxamount;



System.out.printf("grosspay = %f %ntaxamount = %f %nnetpay =%f",grosspay,taxamount,netpay);





// grosspay is hoursworked * rate + bonus
// taxamount is grosspay * taxrate / 100
//netpay = grosspay-taxamount


}
}
