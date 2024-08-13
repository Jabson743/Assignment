import java.util.Arrays;
public class ArrayPractice {
       public static void main(String... args) {

       int [] numbers = {10, 20, 30, 40, 50}; // static initialization

       int [] scores = new int [5]; // array constructor

       String [] names = new String[4];

       names[3] = "Stanley";

       scores[3] = 56;
       numbers[2] = 25;

       for(index = 0; index < numbers.length; index++) {
           System.out.printf("index: %d, element: %d/n", index, number[index]);
       }

       System.out.println("numbers: " + Arrays.toString(numbers));
       System.out.println("scores: " + Arrays.toString(scores)); 
       System.out.println("names: " + Arrays.toString(names));
       System.out.println(scores);
       
 }
}