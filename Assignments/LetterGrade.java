import java.util.Scanner;
public class LetterGrade {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter your score: ");
       int number = input.nextInt();
 
       if (number >= 80) {
          System.out.print("Your grade letter is A");
       }
 
         else if(number >= 79) {
         System.out.print("Your grade letter is B");
      }

         else if(number >= 69) {
         System.out.print("Your grade letter is C");
      }

         else if(number >= 49) {
         System.out.print("Your letter grade is D");
     }
  }
}