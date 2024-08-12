import java.util.Scanner;
public class PersonalityTest {
       public static void main(String... args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Welcome To Semicolon MBTI Personality Test.");
       System.out.println();

       System.out.print("What is your name: ");
       String name = input.nextLine();
       
       System.out.print("Press 1 to start: ");
       int number = input.nextInt();

       int count = 0;

       for(int counter = 1; counter <= 20; counter++) {

       switch (number) {

       case 1:

       System.out.println("Qusetion 1.");
       System.out.println("How do you approach deadlines?");
       System.out.println("A. Work diligently to meet deadlines well in advance");
       System.out.println("B. Tend to work better under pressure and close to the deadline");

       String answer1 = input.nextLine();

       if (answer1.equals("A")) {
       System.out.println("A. Work diligently to meet deadlines well in advance");
       count += 1;
       }
       else if (answer1.equals("B")) {
       System.out.println("B. Tend to work better under pressure and close to the deadline");
       count += 1;
       } 
       else {
       System.out.println("Invalid option. Please select 'A' or 'B'.");
       } 

       case 2:
       System.out.println("Qusetion 2.");
       System.out.println("In a group discussion, do you prefer to stick to the facts and details or contribute ideas and theories?");
       System.out.println("A. Stick to facts and details");
       System.out.println("B. Contribute ideas and theories");

       String answer2 = input.nextLine();

       if (answer2.equals("A")) {
       System.out.println("A. Stick to facts and details");
       count += 1;
       }
       else if (answer2.equals("B")) {
       System.out.println("B. Contribute ideas and theories");
       count += 1;
       } 
       else {
       System.out.println("Invalid option. Please select 'A' or 'B'.");
       } 

       case 3:
       System.out.println("Qusetion 3.");
       System.out.println("When planning a weekend, do you lean towards social plans with friends or quiet time for yourself?");
       System.out.println("A. Social plans with friends");
       System.out.println("B. Quiet time for yourself");

       String answer3 = input.nextLine();

       if (answer3.equals("A")) {
       System.out.println("A. Social plans with friends");
       count += 1;
       }
       else if (answer3.equals("B")) {
       System.out.println("B. Quiet time for yourself");
       count += 1;
       } 
       else {
       System.out.println("Invalid option. Please select 'A' or 'B'.");
       } 

       case 4:
       System.out.println("Qusetion 4.");
       System.out.println("How do you feel about small tasks?");
       System.out.println("A. Enjoy it and find it easy to engage in");
       System.out.println("B. Find it somewhat akward or draining");

       String answer4 = input.nextLine();

       if (answer4.equals("A")) {
       System.out.println("A. Enjoy it and find it easy to engage in");
       count += 1;
       }
       else if (answer4.equals("B")) {
       System.out.println("B.Find it somewhat akward or draining");
       count += 1;
       } 
       else {
       System.out.println("Invalid option. Please select 'A' or 'B'.");
       } 

       case 5: 
       System.out.println("Qusetion 5. How do you feel about routine and predictability?");
       System.out.println("A. Prefer routine and find comfort in predictability");
       System.out.println("B. Dislike routine and enjoy spontaneity");

       String answer5 = input.nextLine();

       if (answer5.equals("A")) {
       System.out.println("Prefer routine and find comfort in predictability");
       count += 1;
       }
       else if (answer5.equals("B")) {
       System.out.println("Dislike routine and enjoy spontaneity");
       count += 1;
       } 
       else {
       System.out.println("Invalid option. Please select 'A' or 'B'.");
       } 

       case 6:
       System.out.println("Qusetion 6. How do you receive information?");
       System.out.println("A. Clear and straightforward explanations");
       System.out.println("B. Rich with possibilities and potentials connections");

       String answer6 = input.nextLine();

       if (answer6.equals("A")) {
       System.out.println("Clear and straightforward explanations");
       count += 1;
       }
       else if (answer6.equals("B")) {
       System.out.println("Rich with possibilities and potentials connections");
       count += 1;
       } 
       else {
       System.out.println("Invalid option. Please select 'A' or 'B'.");
       }

       case 7: 
       System.out.println("Qusetion 7. How do you typically recharge after a busy day?");
       System.out.println("A. Spending time with friends or engaging in a social activities");
       System.out.println("B. Having some alone time to relax and unwind");

       String answer7 = input.nextLine();

       if (answer7.equals("A")) {
       System.out.println("Spending time with friends or engaging in a social activities");
       count += 1;
       }
       else if (answer7.equals("B")) {
       System.out.println("Having some alone time to relax and unwind");
       count += 1;
       } 
       else {
       System.out.println("Invalid option. Please select 'A' or 'B'.");
       } 

       case 8: 
       System.out.println("Qusetion 8. What do you do when your plans suddenly change?");
       System.out.println("A. Dislike unexpected changes and prefer to stick to the original plan");
       System.out.println("B. Adapt well to unexpected changes and enjoy the flexibility");

       String answer8 = input.nextLine();

       if (answer8.equals("A")) {
       System.out.println("Dislike unexpected changes and prefer to stick to the original plan");
       count += 1;
       }
       else if (answer8.equals("B")) {
       System.out.println("Adapt well to unexpected changes and enjoy the flexibility");
       count += 1;
       } 
       else {
       System.out.println("Invalid option. Please select 'A' or 'B'.");
       } 

       case 9: 
       System.out.println("Qusetion 9. How do you approach problem-solving?");
       System.out.println("A. Practical, actionable ideas");
       System.out.println("B. Imaginative, out-of-the-box concept");

       String answer9 = input.nextLine();

       if (answer9.equals("A")) {
       System.out.println("Dislike unexpected changes and prefer to stick to the original plan");
       count += 1;
       }
       else if (answer9.equals("B")) {
       System.out.println("Adapt well to unexpected changes and enjoy the flexibility");
       count += 1;
       } 
       else {
       System.out.println("Invalid option. Please select 'A' or 'B'.");
       } 

       case 10:
       System.out.println("Qusetion 10. How do you make decisions?");
       System.out.println("A. Based on practical considerations and real-world implications");
       System.out.println("B. Consider potential outcomes and future possiblities");

       String answer10 = input.nextLine();

       if (answer10.equals("A")) {
       System.out.println("Based on practical considerations and real-world implications");
       count += 1;
       }
       else if (answer10.equals("B")) {
       System.out.println("Consider potential outcomes and future possiblities");
       count += 1;
       } 
       else {
       System.out.println("Invalid option. Please select 'A' or 'B'.");
       }

       case 11: 
       System.out.println("Qusetion 11. How do handle new and unfamiliar situations?");
       System.out.println("A. Embrace them with enthusiams");
       System.out.println("B. Approach them with caution");

       String answer11 = input.nextLine();

       if (answer11.equals("A")) {
       System.out.println("Embrace them with enthusiams");
       count += 1;
       }
       else if (answer11.equals("B")) {
       System.out.println("Approach them with caution");
       count += 1;
       } 
       else {
       System.out.println("Invalid option. Please select 'A' or 'B'.");
       } 

       case 12: 
       System.out.println("Qusetion 12. When making decisions, do you rely more on your own insticts and feelings or seek input from others?");
       System.out.println("A. Rely on own instincts and feelings");
       System.out.println("B. Seek input from others");

       String answer12 = input.nextLine();

       if (answer12.equals("A")) {
       System.out.println("Rely on own instincts and feelings");
       count += 1;
       }
       else if (answer12.equals("B")) {
       System.out.println("Seek input from others");
       count += 1;
       } 
       else {
       System.out.println("Invalid option. Please select 'A' or 'B'.");
       } 

       case 13: 
       System.out.println("Qusetion 13. How do you typically recharge after a busy day?");
       System.out.println("A. Spending time with friends or engaging in a social activities");
       System.out.println("B. Having some alone time to relax and unwind");

       String answer13 = input.nextLine();

       if (answer13.equals("A")) {
       System.out.println("Spending time with friends or engaging in a social activities");
       count += 1;
       }
       else if (answer13.equals("B")) {
       System.out.println("Having some alone time to relax and unwind");
       count += 1;
       } 
       else {
       System.out.println("Invalid option. Please select 'A' or 'B'.");
       } 

       case 14: 
       System.out.println("Qusetion 14. When making decisions, what holds more weight for you?");
       System.out.println("A. Objective data and analysis");
       System.out.println("B. Personal values and the impact on people");

       String answer14 = input.nextLine();

       if (answer14.equals("A")) {
       System.out.println("Objective data and analysis");
       count += 1;
       }
       else if (answer14.equals("B")) {
       System.out.println("Personal values and the impact on people");
       count += 1;
       } 
       else {
       System.out.println("Invalid option. Please select 'A' or 'B'.");
       } 

       case 15: 
       System.out.println("Qusetion 15. How do you approach conflict resolution?");
       System.out.println("A. Focus on finding logical solutions and compromises");
       System.out.println("B. Positive and supportive team culture");
       System.out.print("Select your answer (A or B): ");

       String answer15 = input.nextLine();

       if (answer15.equals("A")) {
       System.out.println("Focus on finding logical solutions and compromises");
       count += 1;
       }
       else if (answer15.equals("B")) {
       System.out.println("Positive and supportive team culture");
       count += 1;
       } 
       else {
       System.out.println("Invalid option. Please select 'A' or 'B'.");
       } 

       case 16:
       System.out.println("Qusetion 16. How do you cope with stress or pressure?");
       System.out.println("A. Analyse the situation logically and strategize a plan");
       System.out.println("B. Seek emotional support and consider the impact on relationships");
       System.out.println("Select your answer (A or B): ");

       String answer16 = input.nextLine();

       if (answer4.equals("A")) {
       System.out.println("Analyse the situation logically and strategize a plan");
       count += 1;
       }
       else if (answer16.equals("B")) {
       System.out.println("Seek emotional support and consider the impact on relationships");
       count += 1;
       } 
       else {
       System.out.println("Invalid option. Please select 'A' or 'B'.");
       } 

       case 17: 
       System.out.println("Qusetion 17. How do you approach work tasks?");
       System.out.println("A. Like to have a set plan and follow it step by step");
       System.out.println("B. Go with the flow and see where it takes you");

       String answer17 = input.nextLine();

       if (answer17.equals("A")) {
       System.out.println("Like to have a set plan and follow it step by step");
       }
       else if (answer17.equals("B")) {
       System.out.println("Go with the flow and see where it takes you");
       } 
       else {
       System.out.println("Invalid option. Please select 'A' or 'B'.");
       } 

       case 18: 
       System.out.println("Qusetion 18. How do you feel about small tasks?");
       System.out.println("A. Enjoy it and find it easy to engage in");
       System.out.println("B. Find it somewhat akward or draining");

       String answer18 = input.nextLine();

       if (answer15.equals("A")) {
       System.out.println("Enjoy it and find it easy to engage in");
       }
       else if (answer18.equals("B")) {
       System.out.println("Find it somewhat akward or draining");
       } 
       else {
       System.out.println("Invalid option. Please select 'A' or 'B'.");
       } 
      
       case 19:
       System.out.println("Qusetion 19. How do you feel about making plans and sticking to a schedule?");
       System.out.println("A. Enjoy making plans and prefer a structured schedule");
       System.out.println("B. Prefer flexibility and spontaneity, dislike strict schedule");

       String answer19 = input.nextLine();

       if (answer19.equals("A")) {
       System.out.println("Enjoy making plans and prefer a structured schedule");
       }
       else if (answer19.equals("B")) {
       System.out.println("Prefer flexibility and spontaneity, dislike strict schedule");
       } 
       else {
       System.out.println("Invalid option. Please select 'A' or 'B'.");
       } 
   }
  }
 }
}