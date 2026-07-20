import java.util.Scanner;
public class ElseifStatement{
    public static void main(String[] args){
    
    Scanner input = new Scanner (System.in);
    
     System.out.println("enter grade");
        int grade = input.nextInt();
    
    
    
       if(grade >= 90 && grade <= 100 )
       	 System.out.println("A");
    
    else if (grade >= 80 && grade <= 89){
    System.out.println("B");
    }
    
    else if(grade >= 60  && grade <= 69) 
     System.out.println("D");
    
      else if(grade < 60){
      System.out.println("F");
      }
    
    else{
    	System.out.printf("%d is an invalid grade", grade);
    	
    }
    
    
    
    }
}
