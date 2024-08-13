import java.util.Scanner;
public class Grade {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter a letter grade: ");
       char input1 = input.next().charAt(0);

       char myGrade4 = 'A';
       char myGrade3 = 'B';
       char myGrade2 = 'C';
       char myGrade1 = 'D';
       char myGrade0 = 'E';

       if (myGrade4 == 'A') {
       System.out.printf("The numeric value for grade %c is 4", A);
       }
       
       else if (myGrade3 == 'B') {
       System.out.printf("The numeric value for grade %c is 3", B);
       }

       else if (myGrade2 == 'C') {
       System.out.printf("The numeric value for grade %c is 2", C);
       }

       else if (myGrade1 == 'D') {
       System.out.printf("The numeric value for grade %c is 1", D);
       }
       
       else if (myGrade0 == 'E') {
       System.out.printf("The numeric value for grade %c is 0", E);
       }
      
       else {
       System.out.printf("%c is an invalid grade");
   }
}

        