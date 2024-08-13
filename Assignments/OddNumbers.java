import java.util.Scanner;
public class OddNumbers {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       int counter;
       int score = 0;
       int sum = 0;

       for (counter = 1; counter <= 10;  counter++) {

            System.out.print("Enter your score: ");
            int score = input.nextInt();
           
            if (counter % 2 != 0) {
            sum += score;   
           }
           System.out.print("The oddNumber is " + sum);
  }
 }
}