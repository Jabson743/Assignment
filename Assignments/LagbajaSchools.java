import java.util.Scanner;
public class LagbajaSchools {
       public static void main (String[] args) {
       Scanner input = new Scanner(System.in);

       String [] students = {"Student1", "Student2", "Student3", "Student3",};

       String [] subjects = {"Math", "English", "Science",};

       int [][] scores = new int [students.length][subjects.length];

       for (int counter = 0; counter < students.length; counter++) {

           System.out.println("Enter the students scores: " + students[counter]);
           
           for (int count = 0; count < students.length; count++) {

              while (true) {
      
              System.out.println("Enter the scores: " + subjects[count] + "(0-100): "); 
         
              int score = input.nextInt();

                  if (score >= 0 && score <= 100) {
                   
                  scores [counter][count] = score;
                  break;
          } else {
            System.out.println("Invalid score. Please enter a score between 0 and 100");
           }
        }           
      }
    }
  }
}