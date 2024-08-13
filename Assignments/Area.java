import java.util.Scanner;
public class Area {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter the value of the width: ");
       double num1 = input.nextDouble();

       System.out.print("Enter the value of the width: ");
       double num2 = input.nextDouble();

       double total = num1 * num2;

       System.out.printf("The area of a rectangle is %.2f", total);
     }
}
