import java.util.Scanner;
public class Sentinel {
       public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       int flagValue = -1;
       int sum = 0;
       int userInput = 0;
       
       while (userInput != flagValue) {
     
       sum = sum + userInput;

       System.out.println("Enter a value of your score and enter -1 to quit");
       userInput = input.nextInt();
 }
       System.out.printf("The sum of your scores is %d%n", sum);
 }
}