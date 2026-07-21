import java.util.Scanner;
public class SmallestNumber{

  public static int Compare(int a,int b){
  
  int digitOne = a;
  int digitTwo = b;
  
  if(digitOne < digitTwo)
  return digitOne;
  else
      return digitTwo;
  
  }






     public static void main(String[] args){
     Scanner input = new Scanner (System.in);
     
     System.out.println("enter a number");
     int numberOne = input.nextInt();
     
     System.out.println("enter a number");
     int numberTwo = input.nextInt();
     
     System.out.println(Compare(numberOne,numberTwo));
     }
}
