

public class Methods{
   public static void main(String[] args){
   
   
   Multiples(4);
   Word();
   
   int numberresult = DoubleIt(10);
   System.out.println(numberresult);
   
 int  averageresult = Average(34,23,32);
   System.out.println(averageresult);
   
   System.out.println(Isrange(7,15,32));
   
   System.out.println(TrueFalse(-4));
   
   }
   
   public static void Word(){
   
   String message = "welcome to java";
    System.out.println(message);
   
   }
public static int DoubleIt(int a){

    int number = a * 2;
    return number;

}
 
 public static int Average( int a,int b,int c){
 
int averagenumber = (a+b+c)/3;
return averagenumber;

 }
 
 public static boolean Isrange(int n,int low,int high){
   if(n >= low && n <= high){
    return true;
      
    }
    return false;  	
}

public static boolean TrueFalse(int n){

    if(n < 0){
  return true;
}
   return false;
}	
 public static void Multiples(int a){
 int number = 1;

 for(int count= 1;count <= 5;count++){
 
   number = a * count;
 
 System.out.println(number);
 
   }
 
 }
   
   
   
}
