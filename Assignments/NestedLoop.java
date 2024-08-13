import java.util.Scanner;
public class NestedLoop {
       public static void main(String... args) {
       Scanner scanner = new Scanner(System.in);

       a : for (int counter = 0; counter <= 4; counter++) {
            
            for (int count = 0; count < counter; count++) {
                 if (count < 3) {
                 System.out.print("inner loop" + counter); 
       } else break a;
             System.out.println();
             System.out.println("outer loop" + counter);
    }

}


 }
}