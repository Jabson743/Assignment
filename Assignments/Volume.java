import java.util.Scanner;
public class Volume {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter the value of the area: ");
       double num = input.nextDouble();

       double total = num * 5.30425;

       System.out.println("The volume of the Triangular prim is " + total);
      }
}
