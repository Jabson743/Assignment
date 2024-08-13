import java.util.Scanner;
public class InputTask {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Welcome, let's get started!!!");

       System.out.print("Enter a number between one to ten: ");
       int number = input.nextInt();

       switch (number) {

       case 1: System.out.print("One");
       break;

       case 2: System.out.print("Two");
       break;
 
       case 3: System.out.print("Three");
       break;

       case 4: System.out.print("Four");
       break;

       case 5: System.out.print("Five");
       break;
 
       case 6: System.out.print("Six");
       break;

       case 7: System.out.print("Seven");
       break;

       case 8: System.out.print("Eight");
       break;  

       case 9: System.out.print("Nine");
       break;

       case 10: System.out.print("Ten");
       break;

       default: System.out.print("Please enter a valid number, Thank you!!!");     
    }

  }
}