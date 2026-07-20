//import scanner
// collect both ages
// multiply sons age by 2 then print the result

import java.util.Scanner;

    public class Fathersagecal{
    
           public static void main(String[] args){
           
           Scanner input = new Scanner (System.in);
           
           System.out.println("enter fathers age");
           int Fathersage = input.nextInt();
           
           
           
           System.out.println("enter sons age");
           int sonsage = input.nextInt();
           
           
 int   YearsFatherWasTwiceAsOldAsSon = Fathersage -(sonsage * 2);      
           
      System.out.println("the father was twice the sons age: " +     YearsFatherWasTwiceAsOldAsSon + "years ago");     
           
           }
    }
