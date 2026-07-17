import java.util.Scanner;
public class Agechecker{
   public static void main(String[] args){
   
   Scanner input = new Scanner (System.in);
   
   
   System.out.println("enter name");
      String name = input.nextLine();
   
   
   System.out.println("enter age");
       int age = input.nextInt();
   
   
   if(age > 18){
   
   System.out.printf("%s is a gorilla",name);}
   
   else{System.out.printf("%s is a child",name);}
   
   
   
   }
}
