// import scanner
// enter three numbers 
//  numbertwo is largest
//if numbertwo is < numberone numberone is largest number
//numberthree is greater than number numbertwo numbertwo is largest







import java.util.Scanner;
public class Largstofthree{
  public static void main(String[] args){
  
    Scanner input = new Scanner (System.in);
  
   System.out.println("enter number");
    int numberOne = input.nextInt();
  
  
  System.out.println("enter number");
    int numberTwo = input.nextInt();
  
  
  
  System.out.println("enter number");
    int numberThree = input.nextInt();
  
  
  int largest = numberTwo;
  
  
  
  if(numberOne > largest)
   largest = numberOne;
  
  if(numberThree > largest)
    largest = numberThree;
  
  System.out.printf("largest = %d",largest);
  
  
  
  
  }
} 
