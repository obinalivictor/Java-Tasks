import java.util.Scanner;
public class Stars{

public static int Asterisk(int a){

int digitOne= a;

for(int count = 1;count <= digitOne;count++)

   System.out.println("*");

return digitOne;

}
         public static void main(String[] args){
         Scanner input = new Scanner (System.in);
         
        System.out.println("enter number"); 
         int digit = input.nextInt();
         
         System.out.print(Asterisk(digit));
         
         }
}
