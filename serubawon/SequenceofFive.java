// declare and initialise variables balance,deposit,withdraw,monthlyinterest and print final balance








public class SequenceofFive{
     public static void main(String[] args){
     
     
    double  balance = 5000.00;
     double deposit = 1200.50;
      balance = balance + deposit;
     double withdraw = balance - 750.25;
      double monthlyinterest = balance * 1.5;
  double finalbalance = balance +monthlyinterest; 
  
  
     System.out.printf("finalbalance =   %.2f",finalbalance);
     
     }
}
