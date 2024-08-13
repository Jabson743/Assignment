import java.util.Scanner;
public class Greetings {
       public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

       System.out.print("Enter 1 to be greeted in English and 0 to be greeted in Hausa: ");
       int number = input.nextInt();

      System.out.print(number == 1 ? "Hello, Good Morning!!!" : "Ina kwana!!!");
  }
}