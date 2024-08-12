import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenstrualCycle {
       public static void main(String... args) {

		Scanner input = new Scanner(System.in);
	
		System.out.println("Welcome To The Menstrual Cycle Calculator");
		System.out.println();

                System.out.print("What is your name: ");
                String name = input.nextLine();
                System.out.println();

                System.out.println("Hello " + name + ", You Are Welcome To Your Monthly Mentrual Cycle Calculator");
                System.out.println();
	
		System.out.println("Assumed Length Of Cycle Is Between 21 - 35 Days");
		System.out.println();
		
		System.out.print("Enter The Date Of Your Last Menstrual Flow: ");	
		String lastFlowDate = input.nextLine();
                System.out.println();

		System.out.print("Enter The Average Length Of Your Cycle In Days: ");
                int cycleLength = input.nextInt();
                System.out.println();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd -MM -yyyy");
/. 
		LocalDate lastFlowDatePeriod = LocalDate.parse(lastFlowDate, formatter);
		
		LocalDate nextMenstrualFlow = lastFlowDatePeriod.plusDays(cycleLength);

		System.out.print("Your Next Menstrual Flow Starts On: " + nextMenstrualFlow);

		LocalDate ovulationDate = lastFlowDatePeriod.plusDays(cycleLength / 2);

		System.out.print("\nYour Ovulation Date Is: " + ovulationDate + "\n");

		LocalDate fertilePeriodStart = ovulationDate.minusDays(7);

        	LocalDate fertilePeriodEnd = ovulationDate.plusDays(2);

		System.out.print("Your Fertile Period Is Between : " + ovulationDate.minusDays(7) + " - " + ovulationDate.plusDays(2) +"\n");

		LocalDate safePeriodStart = ovulationDate.plusDays(5);

		LocalDate safePeriodEnd = nextMenstrualFlow.minusDays(5);

		System.out.println("Your Safe Period Is Between: " + ovulationDate.plusDays(5) + " - " + nextMenstrualFlow.minusDays(5) );


	}
}