import org.junit.Test;

import static junit.framework.TestCase.*;

public class SubtractTest {
    @Test
    public void test() throws Exception {

        Subtract subtract = new Subtract();
        double a = 3.5;
        double x = subtract.Subtract(2.5, 5.5);

        assertEquals("Ожидали значение: " + a + " (testOK), а Получили значение: " + x + " (testFAIL)", a, x);
        assertNotNull("Ожидали значение НЕ NULL (testOK), а получили значение: " + x + " (testFAIL)", x);
        assertNull("Ожидали значение NULL (testOK), а получили значение: " + x + " (testFAIL)", x);

    }
}
