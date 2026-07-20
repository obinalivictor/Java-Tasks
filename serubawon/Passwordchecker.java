//import scanner 
// collect input that is username and password
//usebif statement to determine if the password entered is correct



import java.util.Scanner;
public class Passwordchecker{
   public static void main(String[] args){
   
     Scanner input = new Scanner (System.in);
   
   
   
   System.out.println("enter username");
    String username = input.nextLine();
   
   
   System.out.println("enter password");
      int password = input.nextInt();
   
   
       if(username == "admin" && password == 1234)
      System.out.println("access granted");
   
            else if(username != "admin" && password != 1234)
       System.out.println("access denied");
   
   
   
   
   
   
   }
}
