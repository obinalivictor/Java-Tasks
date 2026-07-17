// import scanner
// grade is 0
//grade is -1 keep printing grade


import java.util.Scanner;
  public class Studentgrades{
    public static void main(String[] args){
    int grade = 0;
      Scanner input = new Scanner (System.in);
    
     do{
     
     System.out.println("enter grade");
         grade= input.nextInt();
     
     System.out.println(grade);
     
     }while(grade != -1);
    
    
    
    
    
    
    
    
    }
  }
