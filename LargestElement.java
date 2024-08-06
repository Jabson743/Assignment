import java.util.Arrays;
public class LargestElement {
       
        public static int largestNumber (int[] numbers) {
             int max = numbers [0]; 

             for (int counter = 0; counter < numbers.length; counter++) {

                  if(numbers[counter] > max)
                     max = numbers[counter];
                    
             }
                    return max;
         }

         public static int reversesList(int[] number) {

             for (int index = number.length - 1; index >= 0; index--) {
                
                number[index] = number.length - index;
                
          }
                 return number[index];
                //System.out.print(Arrays.toString(number));
      }

    
        public static boolean containsElement(List<Object> list, Object element) {
        for (Object item : list) {
            if (item.equals(element)) {
                return true;
            }
        }
        return false;
    }

}