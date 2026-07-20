import java.util.Scanner;
public class Nepabill{
public static void main (String[] args){

     Scanner input = new Scanner (System.in);


   System.out.println("enter unit");
      double unit = input.nextDouble();

   System.out.println("enter cost");
     double cost = input.nextDouble();


double bill = unit * cost;

 System.out.println("bill = "+bill);


//bill is unit *cost


}
}
