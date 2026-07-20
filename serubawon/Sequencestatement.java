//a sequence statement is a set of statements that are executed one after the the other

import java.util.Scanner;
public class Sequencestatement{
  public static void main(String[] args){
  
      Scanner input = new Scanner (System.in);
  
  System.out.println("enter your name");
    String name = input.nextLine();
  
      System.out.println("enter your age");
          int age = input.nextInt();
    
          input.nextLine();
    
         System.out.println("enter favourite food");
               String food = input.nextLine();
  
  }
}
