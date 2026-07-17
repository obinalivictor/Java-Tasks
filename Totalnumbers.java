//initialise count and total
//totalis total + number
// print total


import java.util.Scanner;
public class Totalnumbers{
    public static void main(String[] args){
    
    Scanner input = new Scanner (System.in);
    
    int count = 1;
    int total = 0;
    
    while(count <= 5){
    
    System.out.println("enter number");
      int number =input.nextInt();
      
      
    total = total +number;  
      
      count++;
    }
    
    System.out.println("total= "+total);
    
    }
}
