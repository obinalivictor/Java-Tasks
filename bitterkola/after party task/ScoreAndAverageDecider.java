import java.util.Scanner;
   public class ScoreAndAverageDecider{
   
       public static void main(String[] args){
       
       Scanner input = new Scanner (System.in);
       
       int total = 0;
      int score = 0;
       int scorecounter = 0;
      for(int count = 1;count <= 3;count++){
      
      
        System.out.println("input score");
         score = input.nextInt();
        
        scorecounter++;
        total = total + score;
        
          
    if( score >= 90 && score <= 100)
           System.out.println("A");
           else if
                  ( score >= 80  && score < 90)
           System.out.println("B");
            else if
                   (score >= 70 && score < 80)
           System.out.println("C");
              else if
                       (score >= 60 && score < 70)
           System.out.println("D");
                  else if 
                       (score <= 59)
           System.out.println("F");
      
       
      
      
      
      
      
 
       
       
       }
       
        
           
       int    average = total / scorecounter;
       
       System.out.println("average of score is: "+average);
       
       }
   
   
   }
