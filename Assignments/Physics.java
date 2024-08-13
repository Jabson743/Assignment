import java.util.Scanner;
public class Physics {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter the value for the starting velocity: ");
       double startingVelocity = input.nextDouble();

       System.out.print("Enter the value for the ending velocity: ");
       double endingVelocity = input.nextDouble();

       System.out.print("Enter the value for the time: ");
       double time = input.nextDouble();

       double result = endingVelocity - startingVelocity;
       double output = result / time;

       System.out.printf("The average acceleration is %.2f", output);
    }
}