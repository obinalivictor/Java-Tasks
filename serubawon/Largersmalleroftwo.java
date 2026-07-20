//import Scanner;
  // input numberone and numbertwo
// use else if to determine which is smaller and larger





import java.util.Scanner;
  public class Largersmalleroftwo{
    public static void main(String[] args){
    
    
       Scanner input = new Scanner (System.in);
    
    
     System.out.println("enter number");
         int numberOne = input.nextInt();
    
    
      System.out.println("enter number");
         int numberTwo = input.nextInt();
    
   
    
      if(numberOne > numberTwo)
    System.out.printf("%d is the largest number",numberOne);
    
    else if (numberOne < numberTwo)
    System.out.printf("%d is smaller number",numberOne);
    
    else if(numberTwo > numberOne)
        System.out.printf("%d is the larger number",numberTwo);
    
      else if (numberTwo < numberOne)
        System.out.printf("%d is the smaller number",numberTwo);
    
    }
  }
