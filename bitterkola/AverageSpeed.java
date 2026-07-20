import java.util.Scanner;
public class AverageSpeed{
public static void main(String[] args){

     Scanner input= new Scanner (System.in);

   System.out.println("enter distance in km");
     double distance = input.nextDouble();

    System.out.println("enter hours");
       double hours = input.nextDouble();

    System.out.println("enter minutes");
       double minutes = input.nextDouble();


 double   timeinhours = hours +(minutes / 60);
    double averagespeed = distance / timeinhours;

     System.out.println("averagespeed is = "+averagespeed );




// convert hours to minute 
// averagespeed is distance / time in hours



}
}
