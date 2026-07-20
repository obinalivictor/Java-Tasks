import java.util.Scanner;
public class Nokia{
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
   
                         case 1:System.out.println("what do you want to search for");
   break;
                          case 2:System.out.println("what number");break;
                          case 3:System.out.println("enter name");break;
                          case 4:System.out.println("do you want to delete");break;   
                          case 5:System.out.println("edit");break;
                          case 6:System.out.println("choose ringtone");break;
                          case 7:System.out.println("who do you want to send a card to");
   break;
                          case 8:System.out.println("option menu");
                                  String optionmenu = """
   
   
  press 1 to type of view 
  press 2 to memory status 
   """;
                       System.out.println(optionmenu);                 
                       int optionmenuchoice = input.nextInt();
   
                      switch(optionmenuchoice){
   
                     case 1:System.out.println("type of view");break;
                     case 2:System.out.println("memory status");break;
                     default:System.out.println("aboki");
   } 
   break;
                     case 9:System.out.println("speed dials");break;
                     case 10:System.out.println("invalid input");break;
                        
                             
   break;
   
   
   
                       
                    case 2:System.out.println(messagesmenu);
                        String messagesmenu = """
       press 1 for write messages        
 press 2 for  inbox       
 press 3 for  outbox       
 press 4 for  picture messages
 press 5 for  templates       
 press 6 for  smileys       
 press 7 for  message settings        
 press 8 for   info service  
 press 9 for  voice mailbox number   
 press 10 for  service command editor   
     
   """; 
       
   
                  System.out.println(messagesmenu);
                    int messagesmenuchoice = input.nextInt();
   
                     switch(messagesmenuchoice){
                    case 1:System.out.println("write message");break;
                    case 2:System.out.println("inbox");break;
                    case 3:System.out.println("outbox");break;
                    case 4:System.out.println("pictures"); break;      
                    case 5:System.out.println("templates");break;
                    case 6:System.out.println("emojis");break;
                    case 7:System.out.println("message settings");
                    
                    String messagesettings = """
                    
  
   press 1 for set1
   press 2 for common3
   """;
                         System.out.println(messagesettings);
                    int messagesettingschoice = input.nextInt();
                    switch(messagesettingschoice){
                    
                             case 1:System.out.println("set1");
                    
                    String set1 = """
                    
  press 1 for message centre number                  
  press 2 for messages sent as                  
  press 3 for message validity                  
                    
   """;
            System.out.println(set1);
                int set1choice = input.nextInt();
                switch(set1choice) {     
                   case 1:System.out.println("message centre number"); break; 
                   case 2:System.out.println("messages sent as"); break; 
                    case 3:System.out.println("message validity");break; 
                    default:System.out.println("invalid input");
                    
                    } break;
                    
                    case 2:System.out.println("common3");
                        String common3 = """
                        
  press 1 for delivery reports
   press 2 for reply via same centre
   press 3 for character support
   
   """;                      
                          System.out.println(common3);
                        
                        int common3choice = input.nextInt();
                        switch(common3choice){
                        
                         case 1:System.out.println("delivery reports"); break; 
                         case 2:System.out.println("reply via same centre"); break; 
                         case 3:System.out.println("character support"); break; 
                         default:System.out.println("invalid input");
                         }break;  
                  }  break;                     
                     
                         case 8:System.out.println("info service");break;
                         case 9:System.out.println("voice mailbox number");break;
                         case 10:System.out.println("service command editor");break;
                          default:System.out.println("invalid input");
                           
                       
                       break;
             }          
      }
   
  
   
   
   
   
     
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   

