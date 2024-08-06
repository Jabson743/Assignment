public class ArrayAssignment {
       public static void main(String... args) {

        int[] numbers = {12, 3, 43, 89, 73, 21, 32};
        System.out.println(LargestElement.largestNumber(numbers));

        int[] number = {1, 2, 3, 4, 5, 6, 7};
        System.out.print(LargestElement.reversesList(number));

        List<Object> myList = List.of("apple", "banana", "cherry");
        Object elementToCheck = "banana";
        boolean result = containsElement(myList, elementToCheck);
        System.out.println("Element found: " + result);
  }
}