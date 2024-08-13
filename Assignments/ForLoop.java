import java.util.Scanner;
public class ForLoop {
       public static void main(String... args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter your number: ");
       int number = scanner.nextInt();

        for (int counter = 1; counter <= 12; counter++) {

        int product = number * counter;
        System.out.printf("%d * %d = %d\n", number, counter, product);
      }
  }
}