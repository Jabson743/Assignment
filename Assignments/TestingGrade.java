import java.util.Scanner;
public class TestingGrade {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter your value: ");
       int number = input.nextInt();

       while (int) {
       
       if (number >= 90) {
          System.out.print("A");
       }

      else if(number >= 80 && number < 90) {
         System.out.print("B");
      }

      else if(number >= 70 && number < 80) {
         System.out.print("B");
      }
      number++;
    }
  }
}