import java.util.Scanner;
public class Science {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the amount of water: ");
    double AmountOfWater = input.nextDouble();

    System.out.print("Enter the initial temperature: ");
    double InitialTemperature = input.nextDouble();

    System.out.print("Enter the final temperature: ");
    double FinancialTemperature = input.nextDouble();

    double result = FinancialTemperature - InitialTemperature;

    double output = AmountOfWater * result * 4184;
    
    System.out.printf("The energy needed is %.2f", output);
    }
}
    
    
