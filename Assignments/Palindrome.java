import java.util.Scanner;
public class Palindrome {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter your three digits integer: ");
       int number = input.nextInt();

       if (number / 100 == 1 && number % 10 == 1) {
        System.out.printf("%d is a palindrome", number);
       }
       else {
        System.out.printf("%d is not a palindrome", number); 
       }
    }
}