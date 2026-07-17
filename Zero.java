import java.util.Scanner;
public class Zero{
    public static void main(String[] args){
    
    Scanner input = new Scanner (System.in);  
    
    System.out.println("enter number");
        int number = input.nextInt();
    
    
    
    while(number != 0){
    
    System.out.println("enter number");
      number = input.nextInt();
      
    if(number == 0){
     break;}
     
    number++;
    }
    
    }
    }
