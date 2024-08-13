import java.util.Scanner;
public class TaskTwo {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

      int score;
      int sum = 0;
      int counter = 1;

      while (counter <= 10) {
      System.out.print("Enter the value of your score: ");
      score = input.nextInt();

      sum += score;
      counter++;
      }
      int average = sum / 10;
      System.out.print("The average of your score is " + average);
      
 }
}