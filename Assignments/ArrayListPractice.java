import java.util.ArrayList;
public class ArrayListPractice {
       public static void main(String... args) {

       ArrayList<String> colors = new ArrayList<>();
       colors.add("Yellow");
       colors.add("Green");
       colors.add("Red");
       colors.add("Blue");
       colors.add("Black");

       for(int check = 0; check < colors.size(); check++){
           System.out.print(colors(check));
      }
  }
}