import java.util.Scanner;
public class LoopLearning {

       public static void main(String... args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter a number: ");
       int number = input.nextInt();

       int counter = 1;
       while (counter <= 12) {
             int product = number * counter;
             System.out.printf("%d * %d = %d\n", number, counter, product);
             counter++;
       }
   }

}