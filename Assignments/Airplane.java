import java.util.Scanner;
public class Airplane {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter the value for speed: ");
       double speed = input.nextDouble();

       System.out.print("Enter the value for acceleration: ");
       double acceleration = input.nextDouble();

       double TotalSpeed = speed * speed;
       double TotalAcceleration = 2 * acceleration;

       double result = TotalSpeed / TotalAcceleration;

       System.out.printf("The minimum runaway length for this airplane is %.2f", result);
    }
}
 