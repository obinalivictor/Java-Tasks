import java.util.Scanner;
public class LoopMulti{
public static void main(String[] args){

     Scanner input = new Scanner (System.in);
     
     System.out.print("Enter a Number: ");
     int number = input.nextInt();
     
    int count =1;
    int multi = number;
    int sum = 0;
    
    while(count <= 10) {
     	sum = number * count;
    	System.out.println(number + " * " + count + " = " + sum);
    	count++;
    } 











}
}
