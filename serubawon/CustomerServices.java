import java.util.Scanner;
  public class CustomerServices{
     public static void main(String[] args){
     
          Scanner input = new Scanner (System.in);
          
          
          
     String mainmenu = """    
          
  welcome to nokia 3310        
          
  press 1 for phonebook        
  press 2 for messages        
  press 3 for chat       
  press 4 for call register       
  press 5 for tones      
  press 6 for settings      
  press 7 for call divert      
  press 8 for games       
  press 9 for calculator       
  press 10 for reminders       
  press 11 for clock       
  press 12 for profiles       
  press 13 for sim services       
          
   """;
       
          
          
                System.out.println(mainmenu) ;  
              int mainmenuchoice = input.nextInt();
          
          
             switch(mainmenuchoice) {        
              case 1 : System.out.println("phonebook");
                   String phonebookmenu = """
          
          
 press 1 for search        
 press 2 for  service nos        
 press 3 for  add name        
 press 4 for  erase
 press 5 for  edit        
 press 6 for  assign tone        
 press 7 for  send b'cord        
 press 8 for   options  
 press 9 for  speed dials   
 press 10 for  voice type   
     
   """;  
     
                         System.out.println(phonebookmenu);
                         
                         
                          int phonebookmenuchoice = input.nextInt();
     
                            switch(phonebookmenuchoice){
     
                               case 8 : System.out.println("options menu");
                               
                                       String optionsmenu = """
                               
    press 1 for type of view                           
    press 2 for memory status                           
                               
     """;                        
             System.out.println(optionsmenu);
             
                     
            int messagemenu = input.nextInt();           
                       }
                       }      
           String message = """                  
                             
   
   press 1 for write messages       
  press 2 for inbox 
  press 3 for outbox      
  press 4 for picture messages      
  press 5 for templates   
  press 6 for smileys     
  press 7 for message settings     
  press 8 for info service      
  press 9 for  voice mailbox number      
  press 10 for service command editor
   """;
   System.out.println( message);
   int messagesettingschoice = input.nextInt();
   
                             switch(messagesettingschoice){
                        case 7 : System.out.println("message settings");
   
                                String messagesettings = """
   
   press 1 for set1
   press 2 for common3
   """;
   
                         System.out.println(messagesettings );
                         
                         
                          int messagesetting = input.nextInt();
                          switch(messagesetting){
                             case 1 : System.out.println("set1") ;
         
                               String set1 = """
   
   press 1 for message center number
   press 2 for messages sent as
   press 3 for messages validity
   """;
                            System.out.println(set1);
                                 case 2 : System.out.println("common3");
   
                                 String common3 = """
   
   press 1 for delivery reports
   press 2 for reply via same centre
   press 3 for character support
   
   """;
          System.out.println(common3);
          int chatmenu = input.nextInt();
   }
   
   }
   
                       
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
                               
                               
                               
                               
                               
                               
                               
                               
     
     
     }
  }
