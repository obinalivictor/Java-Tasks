// import scanner
// input characters
// if letter is among the vowels print vowel
//if not print consonant




import java.util.Scanner;
  public class Vowel{
    public static void main(String[] args){
    
       Scanner input = new Scanner (System.in);
    
    System.out.println("enter vowel");
      char letter = input.nextLine().charAt(0);
    
    
    
      if(letter == 'a'|| letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') System.out.println("vowel");
      else System.out.println("consonant");
    
    
    
    }
  }
