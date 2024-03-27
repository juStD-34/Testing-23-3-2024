import org.junit.Test;
import static org.junit.Assert.assertEquals;
import  static com.example.Main.Bills;

public class test_bill {

    @Test
    public void testBills() {
        assertEquals(70000, Bills(1, true));
    }

    @Test
    public void testBill1() {
        assertEquals(180000, Bills(3, true));
    }

    public void testBill2() {
        assertEquals(385000, Bills(7, true));
    }

    @Test
    public void testBill3() {
        assertEquals(200000, Bills(2, false));
    }
    
    @Test
    public void testBill4() {
        assertEquals(700000, Bills(7, false));
    }

    @Test
    public void testBill5() {
        assertEquals(0, Bills(0, true));
    }

    @Test
    public void testBill6() {
        assertEquals(0, Bills(0, false));
    }

    @Test
    public void testBill7() {
        assertEquals(550000, Bills(10, true));
    }

    @Test
    public void testBill8() {
        assertEquals(1000000, Bills(10, false));
    }

    @Test
    public void testBill9() {
        assertEquals(0, Bills(-1, true));
    }

    
}
