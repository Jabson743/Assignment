import java.util.Scanner;
public class Perimeter {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter the value of the width: ");
       double num1 = input.nextDouble();

       System.out.print("Enter the value of the width: ");
       double num2 = input.nextDouble();

       double num3 = num1 +  num2;
       double total = 2 * num3;

       System.out.printf("The perimeter of a rectangle is %.2f", total);
    }
}

    