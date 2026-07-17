import java.util.Scanner;
  public class Largestnumber{
     public static void main(String[] args){
     
     Scanner input = new Scanner (System.in);
     
     int largest = 0;
     int count = 0;
     
     System.out.println("enter number");
        int number = input.nextInt();
     
     largest = number;
     
     while(count <= 10){
     
     System.out.println("enter number");
         number = input.nextInt();
     
     if(number > largest)
       largest = number;
     
     
     count++;}
     System.out.println(largest);
     
     }
  }
