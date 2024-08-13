import java.util.Scanner;
public class Operator {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter an integer: ");
       int number = input.nextInt();

       if (number % 5 == 0 || number % 3 == 0) {
       System.out.println(number + " is a divisible of 5 and 3");
       }
       else {
       System.out.println(number + " is not a divisible of 5 and 3");
       } 

 }
}