import java.util.Scanner;
  public class DaysOfTheWeek{
    public static void main(String[] args){
    
    Scanner input = new Scanner (System.in);
    
    
    
    
    System.out.println("enter integer");
      int number = input.nextInt();
    
    int DaysOfTheWeek = 7;
    int exactday = number % DaysOfTheWeek;
    
    if(exactday == 1)
    System.out.println("thursday");
    
    
    
    if(exactday== 2)
    System.out.println("friday");
    
    
    
    if(exactday == 3)
    System.out.println("saturday");
    
    
    
    if(exactday == 4)
    System.out.println("sunday");
    
    
    
    if(exactday == 5)
    System.out.println("monday");
    
    
    
    if(exactday == 6)
    System.out.println("tuesday");
    
    
    
    if(exactday == 7)
    System.out.println("wednesday");
    
    
    
    
    
    }
  } 
