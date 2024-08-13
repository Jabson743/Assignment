import java.util.Scanner;
public class Atm{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	boolean continueTransaction = true;
	
	double amount = 0.0;
       double balance = 0.0;
       double currentBalance = 0.0;

       System.out.println("Welcome To GT Bank. Banking At Your Convenience");
       System.out.println();

       System.out.println("Create An Account");
       System.out.print("Enter Your First Name: ");
       String firstName = scanner.next();

       System.out.print("Enter Your Last Name: ");
       String lastName = scanner.next();

       System.out.print("Enter Your Pin: ");
       String pinNumber = scanner.next();

       System.out.println("Pin Created. You Now Have Access To Your Account.");
       System.out.println("Dear " + firstName + " " + lastName + " Your Account Is Successfully Created");
       System.out.println();
	
	
	
	while(continueTransaction){
	String choices = """
			1. View Account Details
			2. Deposit Money
			3. Withdraw Money
			4. Check Account Balance
			5. Transfer
			6. Change Pin
			7. Close Account
			99. ExitApp
			""";

	System.out.print(choices);

	int choice = scanner.nextInt();

	
		switch(choice){
	case 1:  
               System.out.println("FirstName: " + firstName);
               System.out.println("LastName: " + lastName);
               System.out.println("Welcome " + firstName + " " + lastName + " To GT Bank");
               System.out.println();
               break;   
            
        case 2: 
	       System.out.println("Deposit Money");
               System.out.print("Enter The Amount You Want To Deposit: ");
               amount = scanner.nextDouble();
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
               String inputPin = scanner.next();

               if(inputPin.equals(pinNumber)) {
               
               System.out.print("Enter The Amount You Wish To Withdraw: ");
               amount = scanner.nextInt();
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

	case 99:
		continueTransaction = false;
		System.out.println("Thanks for banking with us");
	
	default:
		System.out.println("Invalid input. Please try again");
}
	if(continueTransaction){
	System.out.println("Do You Wish To Perform Another Transaction!!! (yes/no)");
	String response = scanner.next().trim().toLowerCase();
	if (response.equals("yes")){
	continueTransaction = true;
}

	else{
	continueTransaction = false;
	System.out.println("Thanks for banking with us");
}

}
}
		
}
}

 /*System.out.println("Press 1 To Get Started Or (-1) To Quit: ");
       int number = input.nextInt();

       if(number == -1) {
          System.exit(0);
       }
	
       int choice = 1; */