//import scanner
// input radius 
// calculate the area of a circle with variable radius and add the value to na variable declared as area



import java.util.Scanner;
  public class Areaofcircle{
     public static void main(String[] args){
     
       Scanner input = new Scanner (System.in);
     
     System.out.println("enter radius");
         double radius = input.nextDouble();
     
     
    double area = (3.14150 * radius * radius);
    
    System.out.printf("area of a circle = %.2f",area);
    
     
     }
  }
