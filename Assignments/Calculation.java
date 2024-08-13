import java.util.Scanner;
public class Calculation {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter your first number: ");
       int num1 = input.nextInt();

       System.out.print("Enter your second number: ");
       int num2 = input.nextInt();

       System.out.print("Enter your third number: ");
       int num3 = input.nextInt();

       System.out.print("Enter your fourth number: ");
       int num4 = input.nextInt();

       System.out.print("Enter your fifth number: ");
       int num5 = input.nextInt();

       System.out.print("Enter your sixth number: ");
       int num6 = input.nextInt();

       System.out.print("Enter your seventh number: ");
       int num7 = input.nextInt();

       System.out.print("Enter your eighth number: ");
       int num8 = input.nextInt();

       System.out.print("Enter your ninth number: ");
       int num9 = input.nextInt();

       System.out.print("Enter your tenth number: ");
       int num10 = input.nextInt();

       int total = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
       
       System.out.printf("The total of the calculation is %d", total);
       }
}