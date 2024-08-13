import java.util.Scanner;
public class Arith {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Enter your first digit: ");
       int number1 = input.nextInt();

       System.out.println("Enter your second digit: ");
       int number2 = input.nextInt();

       System.out.print("Enter your third digit: ");
       int number3 = input.nextInt();

       int sum = number1 + number2 + number3;
       System.out.printf("The sum of the integers is %d%n", sum);

       int average = sum / 3;
       System.out.printf("The average of the integers is %d%n", average);

       int product = number1 * number2 * number3;
       System.out.printf("The product of the integers is %d%n", product);

       if(number1 < number2 && number1 < number3) {
       System.out.printf("The smallest of the number is %d%n", number1);
       }
 
       else if(number2 < number1 && number2 < number3) {
       System.out.printf("The smallest of the number is %d%n", number2);
       }
       
       else if(number3 < number2 && number3 < number1) {
       System.out.printf("The smallest of the number is %d%n", number3);
       }

       else if(number1 > number2 && number1 > number3) {
       System.out.printf("The largest of the number is %d%n", number1);
       }

       else if(number2 > number1 && number2 > number3) {
       System.out.printf("The largest of the number is %d%n", number2);
       }

       else if(number3 > number1 && number3 > number2) {
       System.out.printf("The largest of the number is %d%n", number2);
       }
    }
}