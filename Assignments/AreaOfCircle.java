import java.util.Scanner;
public class AreaOfCircle {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter the value of the radius: ");
       double radius = input.nextDouble();

       double area = radius * radius * 3.14159;

       System.out.printf("The value of the area is %.2f", area);
    }
}

       