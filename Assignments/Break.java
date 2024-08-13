import java.util.Scanner;
public class Break{
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       int score;
       int counter;

       for (counter = 1; counter <= 10; counter++) {
            System.out.print("Enter your score: ");
            score = input.nextInt();

            if (counter == 5) {
            break;
            }
            System.out.println("The value of the score is: " + counter);
   }

 }
}