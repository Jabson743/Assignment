import java.util.Scanner;
public class BankingApp {
       public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       
       int Sentinel = -1;
       int userInput = input.nextInt();


       while (userInput != Sentinel) {

       System.out.println("Welcome to E-Banking App");

       System.out.println("Press one to continue  and any number to cancel: ");
       int number = input.nextInt();

       switch (number) {

       case 1: 
           String message = """
                        1. Transfer
                        2. Airtime
                        3. Buy Data
                        4. Share Data
                        5. Go back
                            """;

          System.out.print(message); 

         default:
         System.out.println("End of app");
      }
        System.out.print("Do you wish to continue: ");
        userInput = input.nextInt();
      }
    }
  }