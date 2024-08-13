import java.util.Scanner;
public class Chapter2 {
       public static void main(String... args){
       Scanner input = new Scanner(System.in);

       System.out.print("Enter your first integer: ");
       int number1 = input.nextInt();

       System.out.print("Enter your second integer: ");
       int number2 = input.nextInt();

       if (number1 == number2) {
           System.out.println(number1 + " is equals to " + number2);
          }
       if (number1 != number2) {
           System.out.println(number1 + " is not equals to " + number2);
          }
       if (number1 > number2) {
           System.out.println(number1 + " is greater than " + number2);
          }
       if (number1 < number2) {
           System.out.println(number1 + " is less than " + number2);
          }
       if (number1 >= number2) {
           System.out.println(number1 + " is greater than or equals to " + number2);
          }
        if (number1 <= number2) {
           System.out.println(number1 + " is less than or not equals to " + number2);
          }
 }
}