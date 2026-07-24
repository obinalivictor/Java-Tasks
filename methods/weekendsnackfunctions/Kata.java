import java.util.Scanner;
public class Kata{
    public static boolean isEven(int number){
    
    if(number % 2 == 0){
    return true;
    }
    return false;
    
    }
    
     public static boolean isPrimeNumber(int number){
     
     for(int count = 2;count < number;count++)
          if(number % count == 0){
           return false;
     }
          return true;
     
     }
     
     public static int subtract(int numberOne,int numberTwo){
     
     
     int difference = numberOne - numberTwo;
     
     
     return difference;
     
     }
     
     
     public static float divide(int numberOne,int numberTwo){
          
          if(numberTwo == 0){
        return 0;
     }
          
       int quotient = numberOne / numberTwo;
     
        return quotient;
     }
     
     public static int factors(int numberOne){
     int factor = 0;
     for(int count = 1;count <= numberOne;count++)
          if(numberOne % count == 0)
           factor++;  
             
        return factor;
     }
     
     public static boolean isSquare(int number){
     
     int root = (int)Math.sqrt(number);
     
     if(root * root == number){
       return true;
     }
       return false;
     }
     public static int factorial(int number){
     
     int product = 1;
       for(int count = 1;count <= number;count++)
          
           product *= count;  
     
         return product;
     
     
     }
     
     public static int square(int number){
     
     
     int squareOfNumber = number * number;
     
     return squareOfNumber;
     }
     
     public static boolean palindrome(String word){
     
     if()
     
     
     }
     
     
     
     public static void main(String[] args){
     Scanner input = new Scanner (System.in);
     
     System.out.println("enter a integer");
     int digit = input.nextInt();
     
    // int digitResult = isEven(digit);
     
      System.out.println("number is "+isEven(digit));
      
      
     
      System.out.println("enter a integer");
     int prime = input.nextInt();
     
       System.out.println("number is "+isPrimeNumber(prime));
     
     
     
       System.out.println("enter a integer");
     int numberOne = input.nextInt();
     
     
       System.out.println("enter a integer");
     int numberTwo = input.nextInt();
     
     int subtractResult = subtract(numberTwo,numberOne);
     
     System.out.println("the difference between the two numbers is: "+subtractResult);
     
     System.out.println("enter a integer");
     int digitOne = input.nextInt();
     
     System.out.println("enter a integer");
    int digitTwo = input.nextInt();
     
     float divideResult = divide(digitOne,digitTwo);
     
     System.out.println( "the quotient of the two numbers is: "+divideResult);
     
     
     System.out.println("enter number");
     int numberThree = input.nextInt();
     
     
     System.out.println(factors(numberThree));
     
     
      System.out.println("enter number");
     int numberFour = input.nextInt();
     
     
     System.out.println(isSquare(numberFour));
     
     
     System.out.println("enter number");
     int numberFive = input.nextInt();
     
      System.out.println("factorial of the number is: "+factorial(numberFive));
     
     
         System.out.println("enter number");
     int numberSix = input.nextInt();
     
      System.out.println(square(numberSix));
     }
}
