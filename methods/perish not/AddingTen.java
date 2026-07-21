import java.util.Scanner;
public class AddingTen{

public static int Ten(int a){

int number = a + 10;

  return number;
}






    public static void main(String[] args){
    
     Scanner input = new Scanner (System.in);
    
    System.out.println("enter a number");
    int digit = input.nextInt();
    
    
    System.out.println(Ten(digit));
    
    }
}
