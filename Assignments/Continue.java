import java.util.Scanner;
public class Continue {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       int score;
       int counter;

       for (counter = 1; counter <= 10; counter++) {
       System.out.print("Enter your score: ");
       score = input.nextInt();

       if (counter == 5) {
       continue;
       }
       System.out.println("The value of your score is: " + counter);
    }
 }
}