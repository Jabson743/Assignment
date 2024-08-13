import java.util.Scanner;
public class Financial {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter the balance amount: ");
       int balance = input.nextInt();

       System.out.print("Enter the interest rate: ");
       double interest = input.nextDouble();

       double rate = interest / 1200;
       double result = rate * 1000;

       System.out.printf("The interest rate is %.2f", result);
    }
}
       
      