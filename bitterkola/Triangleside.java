import java.util.Scanner;
public class TriangleSide{
public static void main(String[] args){

     Scanner input = new Scanner (System.in);

    System.out.println("enter first side");
       double firstside = input.nextDouble();

   System.out.println("enter second side");
     double secondside = input.nextDouble();

   System.out.println("enter thirdside");
      double thirdside = input.nextDouble();

    System.out.println("enter height");
      double height = input.nextDouble();


    double perimeter = firstside + secondside + thirdside ;
    double area = secondside * height;

     System.out.println(perimeter);
      System.out.println(area);






}
}
