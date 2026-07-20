// import scanner
// collect variable name and age from user
// print both





import java.util.Scanner;
  public class Studentsname{
     public static void main(String[] args){
     
           Scanner input = new Scanner (System.in);
           
           
           System.out.println("enter name");
             String name = input.nextLine();
           
           System.out.println("enter age");
              int age = input.nextInt();
           
           System.out.printf("hello,%s you are %d years old ",name,age);
           
     
     
     }
  }
