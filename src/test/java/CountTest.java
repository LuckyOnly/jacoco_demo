import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class CountTest {

    @Test
    public void testAdd() {
        Count count = new Count();
        int result = count.add(2,2);
        assertEquals(result, 4);
    }

    @Test
    public void testSub() {
        Count count = new Count();
        int result = count.sub(2,2);
        assertEquals(result, 0);
    }


}