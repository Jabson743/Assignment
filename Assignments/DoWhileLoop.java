import java.util.Scanner;
public class DoWhileLoop {
       public static void main(String... args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter your number: ");
       int number = input.nextInt();

       int counter = 1;

       do {
           int product = number * counter;
           System.out.printf("%d * %d = %d\n", number, counter, product);
           counter++;
          } while (counter <= 12);



  }

}