import java.util.Scanner;
public class DoWhile {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       int total = 10;
       int counter = 1;

       do {
          System.out.print("Enter an input: ");
          int number = input.nextInt();
          total += counter;
          counter++;
   }  while (counter <= 10);

      System.out.printf("The total of the output is %d%n", total);
 }
}