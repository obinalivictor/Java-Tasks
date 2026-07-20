// import scanner
//input the number of unit 
//use if else statement to determine the bill




import java.util.Scanner;
public class Utilitybill{
public static void main(String[] args){

   Scanner input = new Scanner (System.in);

      System.out.println("enter unit used");
   int unit = input.nextInt();
   
   
   if(unit >= 0 && unit <=100){
   int amount = 50 *unit;
   System.out.printf("bill = %d",amount);
   }
   
  if(unit >= 101 && unit <= 300){
  int amount = unit * 75;
    System.out.printf("bill = %d",amount);
  }


    if(unit > 300){
      int amount = unit * 100;
    System.out.printf("bill = %d",amount);
    }
   












}
}
