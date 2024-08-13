import java.util.Scanner;
public class CreditCardValidator {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.println("WELCOME TO YOUR CREDIT CARD VALIDATOR CHECK.");
                System.out.println();

                System.out.print("What Is Your Name: ");
                String name = input.nextLine();
                System.out.println();

		System.out.print("Hello" + " " + name + ", " + "Kindly Enter Your Credit Card Details For Verification: ");

		String cardNumber = input.next();
		if (cardNumber == cardNumber) {
			String cardType = getCategory(cardNumber);
			double total = addsumSum2(cardNumber);
			System.out.println("=================================================");
			System.out.println("**Credit Card Type:"+ cardType);
			System.out.println("**Credit Card Number:"+ cardNumber);
			System.out.println("**Credit Card Digit Length:"+ cardNumber.length());
			String valid = checkIfValid(cardNumber);
			System.out.println("**Credit Card Validity Status:"+ valid);
			System.out.println("================================================");
			
		}	
		else {
			System.out.println("Invalid Card Number!!. Dear" + " " + name + "Kindly Check Your Card Number And Try Again");
		}
		
	}

	public static String getCategory(String cardNumber) {
		String cardType = " ";
		if(cardNumber.charAt(0) == '4')cardType =  " Visa Card";
		else if(cardNumber.charAt(0) == '5')cardType =  " MasterCard ";
		else if(cardNumber.charAt(0) == '3'  && cardNumber.charAt(1) == '7')cardType =  " American Express Card ";
		else if(cardNumber.charAt(0) == '6')cardType =  " Discover Card ";
		else cardType =  "Invalid Card";
		return cardType;
	}

	public static boolean cardValidated(String cardNumber) {
		return cardNumber.length() < 13 && cardNumber.length() > 16;

	}

	public static double doublingEveryfirstDigitFromRightToLeft(String cardNumber) {
		double sum2 = 0;
		for(int index = cardNumber.length() - 1; index > 0; index--) {
			int number = Integer.parseInt(String.valueOf(cardNumber.charAt(index)));
			sum2 += number;
			number = 0;
		}
			return sum2;
	}

	public static double doublingEverySecondDigitFromRightToLeft(String cardNumber) {
		double sum = 0;
		for(int index = cardNumber.length() - 1; index > 0; index -= 2){
			int number = Integer.parseInt(String.valueOf(cardNumber.charAt(index)));
			number = number * 2;
			if(number > 9) number = number / 10 + number % 10;
			sum += number;
			number = 0;

		}
			return sum;
	}

	public static double addsumSum2(String cardNumber){
		double total = doublingEverySecondDigitFromRightToLeft(cardNumber) + doublingEveryfirstDigitFromRightToLeft(cardNumber);
		return total;
	}

	public static String checkIfValid(String cardNumber) {
		String cardCheck = "";
			double quotient = addsumSum2(cardNumber) / 10;
			if(quotient % 10 == 0)cardCheck = "Valid";
			else cardCheck = "Invalid";
			return cardCheck;
	}


}