import static org.junit.Assert.assertEquals;
import static com.example.Main.addPositiveNumber;

import org.junit.Test;
public class test01 {
     @Test
     public void testAddPositiveNumber() {
        assertEquals(4, addPositiveNumber(1, 3));
     }

     @Test
     public void testAddPositiveNumber2() {
        assertEquals(0, addPositiveNumber(-2, 3));
     }
}
