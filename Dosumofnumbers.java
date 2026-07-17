// import scanner 
// declare and initialise variable sum,number and count 
// use sum to get the total that is sum = sum +number
// print sum


import java.util.Scanner;
public class Dosumofnumbers{
  public static void main(String[] args){
  
      Scanner input = new Scanner (System.in);
  
  
  int count = 1;
  int sum = 0;
  int number = 0;
  
  do{
     System.out.println("enter number");
          number = input.nextInt();
     
     sum = sum + number;
     count++;
     
     
  }
  while(count <= 5);
  
   System.out.println(sum);
  
  }
}


