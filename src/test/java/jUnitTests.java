import org.junit.Test;
import static org.junit.Assert.*;

public class jUnitTests {

        @Test
        public void testIfNameIsFred(){
            String expected = "Fred";
            String actual = "Fred";

            assertEquals(expected, actual);
        }

        @Test
        public void testIfChangeIsCorrect(){
            double price = 10.0;
            double discount = 4.5;

            assertEquals(5.0, price - discount, 0.5);
            assertNotEquals(4.2, price-discount, 0.5);
        }


}
