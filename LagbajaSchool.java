import java.util.Scanner;
import java.util.Arrays;
public class LagbajaSchool {
       public static void main(String... args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Welcome to Lagbaja School");

       String[] students = {"Student1", "Student2", "Student3", "Student4"};
       String[] subjects = {"Maths", "English", "Science"};

       int[][] scores = new int[students.length][subjects.length];

       System.out.println("How many students do you have?");
       int student = input.nextInt();
       
       System.out.println("How many subjects do they offer?");
       int subject = input.nextInt();

       for(int counter = 0; counter < students.length; counter++) {

           System.out.println("Enter the students scores: " + students[counter]);

            for(int count = 0; count < students.length; count++) {
                 
                 while(true) {
          
                  System.out.println("Enter the scores: " + subjects[count] + "(0 - 100): ");

                  int score = input.nextInt();

                  }
            }
       }

  }     
}