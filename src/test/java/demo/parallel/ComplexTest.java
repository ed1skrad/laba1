package test.java.demo.parallel;

import demo.parallel.Complex;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ComplexTest {

    @Test
    public void testSubtract() {
        Complex a = new Complex(5, 6);
        Complex b = new Complex(3, 2);
        Complex result = a.subtract(b);
        assertEquals(2, result.getRe(), 0.0001);
        assertEquals(4, result.getIm(), 0.0001);
    }

    @Test
    public void testDivide() {
        Complex a = new Complex(10, 8);
        Complex b = new Complex(2, 2);
        Complex result = a.divide(b);
        assertEquals(4.5, result.getRe(), 0.0001);
        assertEquals(0.5, result.getIm(), 0.0001);
    }
}
