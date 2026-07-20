//import scanner
//initaialise number as 0
// use Scanner to ask for number as long as the number is negative




import java.util.Scanner;
public class Untilpositive{
    public static void main(String[] args){
    
    
        Scanner input = new Scanner (System.in);
    
    int number = 0;
    
     
    do{
    System.out.println("enter number");
       number = input.nextInt();
    }while(number < 0);
    
    
    System.out.println("number is positive");
    
    
    
    }
}
