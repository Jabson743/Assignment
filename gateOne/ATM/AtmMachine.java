import java.util.ArrayList;
import java.util.Scanner;
public class AtmMachine {  
       public static void main(String... args) {
       Scanner input = new Scanner(System.in);
       
       double amount = 0.0;
       double balance = 0.0;
       System.out.println("***********************************************");
       System.out.println("Welcome To GT Bank. Banking At Your Convenience");
       System.out.println("***********************************************");

       System.out.println("Create An Account");
       System.out.print("Enter Your First Name: ");
       String firstName = input.next();

       System.out.print("Enter Your Last Name: ");
       String lastName = input.next();

       System.out.print("Enter Your Four Digits Pin: ");
       String pinNumber = input.next();

       System.out.println("=================================================");
       System.out.println("Pin Created. You Now Have Access To Your Account.");
       System.out.println("Dear " + firstName + " " + lastName + " Your Account Is Successfully Created");
       System.out.println("=================================================");
       System.out.println();

       System.out.print("Press 1 To Get Started Or (-1) To Quit: ");
       int number = input.nextInt();

       if(number == -1) {
          System.exit(0);
       }
	
       boolean continueTransaction = true; 

       while (true) {

       String options = """
			1. View Account Details
			2. Deposit Money
			3. Withdraw Money
			4. Check Account Balance
			5. Transfer
			6. Change Pin
			7. Close Account
			""";

       System.out.print(options);

       int response = input.nextInt();

       switch(response) {

       case 1:  
               System.out.println("FirstName: " + firstName);
               System.out.println("LastName: " + lastName);
               System.out.println("======================================");
               System.out.println("Welcome " + firstName + " " + lastName + " To GT Bank");
               System.out.println("======================================");
               break;   
            
        case 2: 
	       System.out.println("Deposit Money");
               System.out.print("Enter The Amount You Want To Deposit: ");
               amount = input.nextDouble();
               balance += amount;
               System.out.println("=============================================================");
               System.out.println("You Have Just Successfully Deposited " + amount + " " + "Into Your Account");
               System.out.println("=============================================================");
               System.out.println();
               System.out.println("========================================");
               System.out.println("Your Current Account Balance Is " + balance);
               System.out.println("========================================");
               break;

       case 3: 
               System.out.println("Withdraw Money");
               System.out.print("Enter Your Pin: ");
               String inputPin = input.next();

               if(inputPin.equals(pinNumber)) {
               
               System.out.print("Enter The Amount You Wish To Withdraw: ");
               amount = input.nextInt();
               if(amount < balance) {
               balance -= amount;
               System.out.println("============================================================");
               System.out.println("You Have Just Successfully Withdraw " + amount + " " + "From Your Account");
               System.out.println("============================================================");
               }
               else {
               System.out.println("==================");
               System.out.println("Insufficient funds");
               System.out.println("==================");
               }
               System.out.println("==========================================");
               System.out.println("Your Current Account Balance Is " + balance);
               System.out.println("==========================================");
               }
               else {
               System.out.println("=============");
               System.out.println("Incorrect Pin");
               System.out.println("=============");
               }
               break;

       case 4: 
              System.out.println("Check Your Account Balance");
              System.out.println("=================================================================");
              System.out.println(firstName + " " + lastName + " Your Account Balance Is: " + balance);
              System.out.println("=================================================================");
              break;

       case 5: 
              System.out.println("Transfer");
              System.out.print("Enter Your Pin: ");
              String enterPin = input.next();

              if(enterPin.equals(pinNumber)) {

              System.out.print("Enter The Amount You Wished To Transfer: ");
              amount = input.nextDouble();
              System.out.println();
              if(amount > balance) {
              System.out.println("==================");
              System.out.println("Insufficient funds");
              System.out.println("==================");
              }
              else {
              balance -= amount;
              System.out.println("===================");
              System.out.println("Transfer Successful");
              System.out.println("===================");
 
              }
	   }
           else {
              System.out.println("=============");
              System.out.println("Incorrect Pin");
              System.out.println("=============");
               }
		break;

       case 6:
              System.out.println("Change Your Pin");
              System.out.print("Enter Your Old Transaction Pin: ");
              String oldPin = input.next();
              if(pinNumber.equals(oldPin)) {
              System.out.print("Enter Your New Choice Of Pin: ");
              String newPin = input.next();
	      pinNumber = newPin;
              System.out.println("==================================================");
              System.out.println("You Have Successfully Changed Your Transaction Pin");
              System.out.println("==================================================");
              }
              else {
              System.out.println("==================================================");
              System.out.println("Incorrect Pin, Kindly Enter A Valid Pin. Thanks!!!");
              System.out.println("==================================================");
              }
              break;
       
       case 7: 
              System.out.println("Close Account");
              System.out.println("=========================================");
              System.out.println("Your Account Has Successfully Been Closed");
              System.out.println("=========================================");
              break;

       default:
              System.out.println("=======================================");
              System.out.println("Invalid Code. Kindly Enter A Valid Code");
              System.out.println("=======================================");
              break;
       }
              
              if(continueTransaction == true) {
              System.out.println("Do You Wish To Perform Another Transaction!!! (yes/no)");
              String reply = input.next();
              if(reply.equals("yes")) {
              continue;
              }
              else {
              System.out.println("Thanks For Banking With Us!!!");
              break;
              }        
            }
  }
 }
}