import java.util.Scanner;
public class EqualityCheck{


  public static boolean TrueFalse(int a,int b){
  
  if(a == b)
  return true;
  else
      return false;
  
  
  
  }





    public static void main(String [] args){
    Scanner input = new Scanner (System.in);
    
      System.out.println("enter a number");
     int numberOne = input.nextInt();
    
      System.out.println("enter a number");
     int numberTwo = input.nextInt();
    
    System.out.println(TrueFalse(numberOne,numberTwo));
    
    }
}
