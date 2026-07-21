import java.util.Scanner;
public class CelsiusToFahrenheit{

public static double Temperature(int a){

 double fahrenheit = (a *1.8)+ 32;


return fahrenheit;


}




    public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    
    System.out.println("enter temperature");
     int celsius = input.nextInt();
     
     
     System.out.println(Temperature(celsius));
     
     
    
    }
}
