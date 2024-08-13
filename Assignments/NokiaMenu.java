import java.util.Scanner;
public class NokiaMenu {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("List Of Menu Functions");
        
       System.out.print("Hello, press a number to get started.");
       int number = input.nextInt();

       switch (number) {
      
       case 1:
            System.out.println("Phone book");
            System.out.println("Enter value 1 to continue: ");

            String phoneBook =  """
                                1. Search
                                2. Service Nos
                                3. Add name
                                4. Erase
                                5. Edit
                                6. Assign tone
                                7. Send b'card
                                8. Options				
                                9. Speed dials
                                10. Voice tags
                                """;

             System.out.print(phoneBook);

             System.out.println("Hi, press a number to continue: ");
             int value = input.nextInt();

             switch (value) {
             
             case 1: System.out.println("Search");
             break;

             case 2: System.out.println("Service Nos");
             break;

             case 3: System.out.println("Add name");
             break;

             case 4: System.out.println("Erase");
             break;

             case 5: System.out.println("Search");
             break;
 
             case 6: System.out.println("Assign tone");
             break;

             case 7: System.out.println("Send b'card");
             break;
             
             case 8: 
             System.out.println("Options:");
             String options = """
                              1. Type of view
                              2. Memory status
                              """;

                      System.out.println(options);
                      break;

             case 9: System.out.println("Speed dials");
             break;

             case 10: System.out.println("Voice tags");
             break;

            default: 
         }

            case 2:
            System.out.println("Messages");
            System.out.println("Enter value 2 to continue: ");

            String message = """
                             1. Write messages
                             2. Inbox
                             3. Outbox
                             4. Picture messages
                             5. Templates
                             6. Smileys
                             7. Message settings
                             8. Info service
                             9. Voice mailbox number
                             10. Service command editor
                             """;

            System.out.println(message);

            System.out.println("Hello, press a number to continue: ");
            int userInput = input.nextInt();

            switch (userInput) {

            case 1: System.out.println("Write messages");
            break;

            case 2: System.out.println("Inbox");
            break;

            case 3: System.out.println("Output");
            break;

            case 4: System.out.println("Picture messages");
            break;

            case 5: System.out.println("Templates");
            break;

            case 6: System.out.println("Write messages");
            break;

            case 7: 
            System.out.println("Messages settings: ");
            System.out.println("Set 1: ");

              String setOne = """
                              1. Message centre number
                              2. Message sent as 
                              3. Message validity
                              """;

              System.out.println(setOne);
              System.out.println("Common: ");
       
              String common = """
                               1. Delivery reports
                               2. Reply via same centre
                               3. Character support
                               """;

              System.out.println(common);
              break;

             case 8: System.out.println("Info services");
             break;

             case 9: System.out.println("Voice mailbox number");
             break;

             case 10: System.out.println("Service command editor");
             break;
       }

        case 3: 
        System.out.println("Chat");
        break;

        case 4: 
              System.out.println("Call register");
              System.out.println("Enter number 4 to continue: ");             

              String calls = """
                             1. Missed calls
                             2. Received calls 
                             3. Dailed numbers
                             4. Erase recent call list
                             5. Show calls' duration
                             6. Show call costs
                             7. Call cost settings
                             8. Prepaid credit
                             """;

             System.out.println(calls);

             System.out.println("Select an option to continue: ");
             int CallInput = input.nextInt();
 
             switch (CallInput) {

             case 1: System.out.println("Missed calls");
             break;

             case 2: System.out.println("Received calls");
             break;

             case 3: System.out.println("Dailed numbers");
             break;

             case 4: System.out.println("Erased recent call list");
             break;

             case 5: 
                 String call = """
                               1. Last call duration
                               2. All calls' duration
                               3. Received calls' duration
                               4. Dailed calls' duration
                               5. Clear timers
                               """;

                 System.out.println(call);
                 break;

            case 6:
                 String CallCosts = """
                                    1. Last call cost
                                    2. All calls' cost
                                    3. Clear counters
                                    """;
         
                 System.out.println("CallCosts");
                 break;

            case 7:
                 String CostSettings = """
                                       1. Call cost limit
                                       2. Show costs in
                                       """;

                 System.out.println(CostSettings);
                 break;
           
            case 8: System.out.println("Prepaid credit");
            break;
       }
           
            case 5:
                 System.out.println("Tones");
                 System.out.println("Input a number to continue");

                 String select = """
                                 1. Ringing tones
                                 2. Ringing volume
                                 3. Incoming call alert
                                 4. Composer
                                 5. Message alert tone 
                                 6. Keypad tones
                                 7. Warning and game tones
                                 8. Vibrating alert
                                 9. Screen saver
                                 """;

                 System.out.println(select);

                 System.out.println("Enter a number to continue");
                 int tones = input.nextInt();

                 switch (tones) {
          
                 case 1: System.out.println("Ringing tones");
                 break;

                 case 2: System.out.println("Ringing volume");
                 break;

                 case 3: System.out.println("Incoming call alert");
                 break;
  
                 case 4: System.out.println("Composer");
                 break;

                 case 5: System.out.println("Message alert tone");
                 break;

                 case 6: System.out.println("Keypad tones");
                 break;

                 case 7: System.out.println("Warning and game tones");
                 break;

                 case 8: System.out.println("Vibrating alert");
                 break;

                 case 9: System.out.println("Screen saver");
                 break;
           }

         case 6: 
              System.out.println("Settings");
                
              System.out.println("Call settings");
              System.out.println("Click a number between 1 to 6 to continue with call settings");
              int set = input.nextInt();

              switch (set) {
                      case 1:
                      String setting = """
                                       1. Automatic redial
                                       2. Speed dialing
                                       3. Call waiting options
                                       4. Own number sending
                                       5. Phone line in use 
                                       6. Automatic answer
                                       """;
                     System.out.println(setting);
                     break;
   
                     case 2: 
                     String phone = """
                                    1. Language
                                    2. Cell info display
                                    3. Welcome note
                                    4. Network selection
                                    5. Lights
                                    6. Confirm SIM service actions
                                    """;
                     System.out.println(phone);
                     break;

                     case 3: 
                     String security = """
                                       1. PIN code request
                                       2. Call barring service
                                       3. Fixed dialing
                                       4. Closed user group
                                       5. Phone security
                                       6. Change access codes
                                       """;
                     System.out.println(security);
                     break;

                     case 4: System.out.println("Restore factory settings");
                     break;
               }
           
                 case 7: System.out.println("Call divert");
                 break;

                 case 8: System.out.println("Games");
                 break;

                 case 9: System.out.println("Calculator");
                 break;

                 case 10: System.out.println("Reminders");
                 break;

                 case 11: 
                        System.out.println("Clock");
                         
                        System.out.println("Select an option to continue");
                        String clocks = """
                                        1. Alarm clock
                                        2. Clock settings
                                        3. Date settings 
                                        4. Stopwatch
                                        5. Countdown timer
                                        6. Auto update of date and time
                                        """;
                        System.out.println(clocks);
                        break;

                 case 12: System.out.println("Profiles");
                 break;

                 case 13: System.out.println("Sim services");
                 break;
  }              
 }
}