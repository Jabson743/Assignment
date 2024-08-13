import java.util.Scanner;
import java.util.Random;
public class Game {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	Random random = new Random();
        int randoms = random.nextInt(0, 3);
        int userInput = input.nextInt();
        String computerValue = "";

        if(userInput == 0 && computerValue == 1) {
        System.out.print("The computer is scissor. You are rock. You won");
        }

        if(userInput == 2 && computerValue == 2) {
        System.out.print("The computer is paper. You are paper too. It is a draw");
        }  

        if(userInput == 1 && computerValue == 2) {
        System.out.print("The computer is paper. You are rock. You lose");
        }
     }
 }     