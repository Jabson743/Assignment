import java.util.Scanner;
public class TaskOne {
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
      System.out.print("The sum of your score is " + sum);
      
 }
}