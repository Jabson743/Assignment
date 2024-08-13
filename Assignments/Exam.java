import java.util.Scanner;
public class Exam {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Enter your score: ");
       int number1 = input.nextInt();

       if (number1 >= 60) {
       System.out.println("You passed the exam");
       }

       else if (number1 <= 59) {
       System.out.println("You don't pass the exam");
       }

       else {
       System.out.println("input");
       }

       System.out.println("Enter your score: ");
       int number2 = input.nextInt();

       if (number2 >= 60) {
       System.out.println("You passed the exam");
       }

       else if (number2 <= 59) {
       System.out.println("You don't pass the exam");
       }

       else {
       System.out.println("input");
       }

       System.out.println("Enter your score: ");
       int number3 = input.nextInt();


       if (number3 >= 60) {
       System.out.println("You passed the exam");
       }

       else if (number3 <= 59) {
       System.out.println("You don't pass the exam");
       }

       else {
       System.out.println("input");
       }

    }
}