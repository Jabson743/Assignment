import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the value of the radius: ");
    double num = input.nextDouble();

    double total = 2 * 6.5 * 3.14159;
    
    System.out.printf("The perimeter of a circrle is %.2f", total);
    }
} 