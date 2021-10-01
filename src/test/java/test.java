import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class test {
    @Test
    public void testTrue()  {
        assertTrue(main.luckyTicket("123123"));
    }
    @Test
    public void testFalse1() {
        assertFalse(main.luckyTicket("123124"));
    }
    @Test
    public void testFalse2() {
        assertFalse(main.luckyTicket("12341234"));
    }
    @Test
    public void testFalse3() {
        assertFalse(main.luckyTicket(""));
    }
    @Test
    public void testFalse4() {
        assertFalse(main.luckyTicket("      "));
    }
}
