import java.util.Scanner;
public class PersonalityTest {
       public static void main(String... args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Welcome To Semicolon MBTI Personality Test.");

       System.out.print("What is your name: ");
       String name = input.nextLine();
       
       System.out.print("The questions are from 1 to 20 in total: ");
       int number = input.nextInt();

       switch (number) {

       case 1:

       System.out.println("Qusetion 1. How do you approach deadlines?");
       System.out.println("A. Work diligently to meet deadlines well in advance");
       System.out.println("B. Tend to work better under pressure and close to the deadline");

       String answer1 = input.nextLine();

       if (answer1.equals("A")) {
       System.out.println("Work diligently to meet deadlines well in advance");
       }
       else if (answer1.equals("B")) {
       System.out.println("Tend to work better under pressure and close to the deadline");
       } 
       else {
       System.out.println("Invalid option. Please select 'A' or 'B'.");
       } 

       case 2:
       System.out.println("Qusetion 2. In a group discussion, do you prefer to stick to the facts and details or contribute ideas and theories?");
       System.out.println("A. Stick to facts and details");
       System.out.println("B. Contribute ideas and theories");

       String answer2 = input.nextLine();

       if (answer2.equals("A")) {
       System.out.println("Stick to facts and details");
       }
       else if (answer2.equals("B")) {
       System.out.println("Contribute ideas and theories");
       } 
       else {
       System.out.println("Invalid option. Please select 'A' or 'B'.");
       } 

       case 3:
       System.out.println("Qusetion 3. When planning a weekend, do you lean towards social plans with friends or quiet time for yourself?");
       System.out.println("A. Social plans with friends");
       System.out.println("B. Quiet time for yourself");

       String answer3 = input.nextLine();

       if (answer3.equals("A")) {
       System.out.println("Social plans with friends");
       }
       else if (answer3.equals("B")) {
       System.out.println("Quiet time for yourself");
       } 
       else {
       System.out.println("Invalid option. Please select 'A' or 'B'.");
       } 

    }
  }
}