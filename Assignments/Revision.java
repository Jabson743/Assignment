import java.util.Scanner;
public class Revision{
       public static void main(String... args) {
       Scanner input = new Scanner(System.in);

       String numbers = "";

       for (int count = 0; count < 10; count++) {
       System.out.print("Enter number + "(count + 1));
       int number = input.nextInt();
       numbers = (numbers + number);
       if(count < 9) numbers+=", ";

       }

       System.out.println(numbers);

  }
}