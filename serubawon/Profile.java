//import scanner
//collect firstname ,lastnameand year of birth
//calculate the difference of yearof birth minus 2025
//print profile




import java.util.Scanner;
  public class Profile{
     public static void main(String[] args){
     
        Scanner input =new Scanner (System.in);
     
     
     System.out.println("enter first name");
        String firstname = input.nextLine();
     
     System.out.println("enter last name");
         String lastname = input.nextLine();
     
     
          System.out.println("year of birth");
              int yearofbirth = input.nextInt();
     
     
     int currentage = 2025 - yearofbirth;
     
     System.out.printf("your firstname is  %s %nyour lastname is  %s  %nyou are %d years old",firstname,lastname,currentage);
     
     
     
     
     }
  }
