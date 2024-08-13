import java.util.Scanner;
public class SumAverage {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter the value of your first score: ");
       int number1 = input.nextInt();

       System.out.print("Enter the value of your second score: ");
       int number2 = input.nextInt();  

       System.out.print("Enter the value of your third score: ");
       int number3 = input.nextInt();   

       System.out.print("Enter the value of your fourth score: ");
       int number4 = input.nextInt();  

       System.out.print("Enter the value of your fifth score: ");
       int number5 = input.nextInt();

       System.out.print("Enter the value of your sixth score: ");
       int number6 = input.nextInt();

       System.out.print("Enter the value of your seventh score: ");
       int number7 = input.nextInt();
 
       System.out.print("Enter the value of your eigth score: ");
       int number8 = input.nextInt();

       System.out.print("Enter the value of your nineth score: ");
       int number9 = input.nextInt();

       System.out.print("Enter the value of tenth number: ");
       int number10 = input.nextInt();

       int sum = number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8 + number9 + number10;

       int average = sum / 10;

       System.out.printf("The sum of the numbers is %d%n", sum);
       System.out.printf("The average of the number is %d%n", average);
          
  }
}