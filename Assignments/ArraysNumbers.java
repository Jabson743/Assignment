import java.util.Arrays;
public class ArraysNumbers {
       public static void main(String... args) {

       
        int[] numbers = new int [10];
        for (int counter = 0; counter < numbers.length; counter++) {       
      
           numbers[counter] = counter + 1;

    }
         System.out.print(Arrays.toString(numbers)); 
  }
}