import java.util.Scanner;
  public class Smallestnumber{
     public static void main(String[] args){
     
     Scanner input = new Scanner (System.in);
     
     int smallest = 0;
     int count = 0;
     
     System.out.println("enter number");
        int number = input.nextInt();
     
     smallest = number;
     
     while(count <= 5){
     
     System.out.println("enter number");
         number = input.nextInt();
     
     if(number < smallest)
       smallest = number;
     
     
     count++;}
     System.out.println("smallest =  "+smallest);
     
     }
  }
