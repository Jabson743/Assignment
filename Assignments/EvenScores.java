import java.util.Scanner;
public class EvenScores {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      
       int counter = 1;
       int score;
       int sum = 0;

       for (counter = 1; counter <= 10; counter++) {
           System.out.print("Enter the value of your score: ");
           score = input.nextInt();

           if (score % 2 == 0) {
           
           }
           sum += counter;
           System.out.println("The sum of the score is: " + sum);
  }
 }
}