import java.util.Scanner;
public class Rectangle {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter the value of your width: ");
       double width = input.nextDouble();

       System.out.print("Enter the value of your height: ");
       double height = input.nextDouble();

       double total = width * height;

       System.out.printf("The area of a rectangle is %.2f", total);

       }
}
