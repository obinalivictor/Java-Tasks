import java.util.Scanner;
public class BmiDisplay{
  public static void main(String[] args){
  
     Scanner input = new Scanner (System.in);
  
   System.out.println("enter weight");
     double weight = input.nextDouble();
  
    System.out.println("enter height");
       Double height = input.nextDouble();
  
   double bmi = weight/(height*height);
  
  
  
  
  
 System.out.println("bmi ="+bmi);
  
  
 // enter height and weight 
  //bmi = weight/height*height
  
  
  
  }
}
