import java.util.Scanner;
public class TaskFive {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

      int score;
      int sum = 0;
      int counter = 1;

      while (counter <= 10) {
      System.out.print("Enter the value of your score: ");
      score = input.nextInt();

      if (score % 2 == 0) {
      sum += score;
      counter++;
      }
     
      System.out.println("The sum of the even indexes is " + sum);
    }     
   }
 }