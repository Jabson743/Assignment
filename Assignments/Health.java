import java.util.Scanner;
public class Health {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter weight in pounds: ");
    double weight = input.nextDouble();

    System.out.print("Enter height in inches: ");
    double height = input.nextDouble();

    double weight = weight * 0.45359237;
    double height = height * 0.0254;
    double height = height * 2;

    double total = weight / height;

    System.out.printf("BMI is %.2f", total);
    }
}