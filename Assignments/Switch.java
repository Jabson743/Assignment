import java.util.Scanner;
public class Switch {
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter the value of your grade: ");
       int number = input.nextInt();

      switch (number) {

      case 80: 
         System.out.print("Your grade value is " + "A");
         break;
     
      case 70: 
         System.out.print("Your grade value is " + "B");
         break;
 
      case 60: 
         System.out.print("Your grade value is " + "C");
         break;

      case 50: 
         System.out.print("Your grade value is " + "D");
         break;

      case 40: 
         System.out.print("Your grade value is " + "E");
         break;
      
    }
 }
}