import java.util.Scanner;
public class Car {
   public static void main (String[] args) {
   Scanner input = new Scanner(System.in);

   System.out.print("Enter the driving distance: ");
   double num1 = input.nextDouble();

   System.out.print("Enter miles per gallon: ");
   double num2 = input.nextDouble();

   System.out.print("Enter price per gallon: ");
   double num3 = input.nextDouble();
  
   System.out.print("The cost of driving is ");
   double total = num1 / num2 * num3;

   System.out.printf("Total is %.2f", total);
   }
}