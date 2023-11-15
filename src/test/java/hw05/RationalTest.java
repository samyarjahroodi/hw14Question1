package hw05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RationalTest {

    @Test
    public void testAdd() {
        Rational rational1 = new Rational(1, 2);
        Rational rational2 = new Rational(1, 3);
        Rational result = rational1.add(rational2);
        assertEquals(5, result.getNumerator());
        assertEquals(6, result.getDenominator());
    }

    @Test
    public void testSubtract() {
        Rational rational1 = new Rational(3, 4);
        Rational rational2 = new Rational(1, 4);
        Rational result = rational1.sub(rational2);
        assertEquals(8, result.getNumerator());
        assertEquals(16, result.getDenominator());
        result.simplify();
        assertEquals(1, result.getNumerator());
        assertEquals(2, result.getDenominator());
    }

    @Test
    public void testMultiply() {
        Rational rational1 = new Rational(2, 3);
        Rational rational2 = new Rational(3, 4);
        Rational result = rational1.mul(rational2);
        assertEquals(6, result.getNumerator());
        assertEquals(12, result.getDenominator());
    }

    @Test
    public void testDivide() {
        Rational rational1 = new Rational(2, 3);
        Rational rational2 = new Rational(3, 4);
        Rational result = rational1.div(rational2);
        assertEquals(8, result.getNumerator());
        assertEquals(9, result.getDenominator());
    }

    @Test
    public void testSimplify() {
        Rational rational = new Rational(4, 8);
        rational.simplify();
        assertEquals(1, rational.getNumerator());
        assertEquals(2, rational.getDenominator());
    }

    @Test
    public void testToFloatingPoint() {
        Rational rational = new Rational(1, 2);
        assertEquals(0.5, rational.toFloatingPoint(), 0.001);
    }

    @Test
    public void testMixedNumber() {
        Rational rational = new Rational(5, 2);
        assertEquals("2 1/2", rational.mixedNumber());
    }
}
