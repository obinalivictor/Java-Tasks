import java.util.Scanner;
public class AbsoluteValue{

public static int Round(int a){

int number = a;

     if(number < 0){
    return -number;
    }
    return number;
    
    
}



    public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    
    System.out.println("enter number");
    int digit = input.nextInt();
    
    System.out.println(Round(digit));
    }
}
