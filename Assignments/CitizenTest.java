import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEqauls;
public class CitizenTest {

       @Test
       public void testThatCalculateYearlyIncome() {
       
              Citizen citizen = new Citizen();

              citizen.setName("Jabson Jay");

              citizen.setEarnings(30_000);

              double tax = citizen.getYearlyIncomeTax();

              assertEquals(4_500, tax);

       }
        
}