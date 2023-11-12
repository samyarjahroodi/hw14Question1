import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticOperationsTest {
    @Test
    void add() {
        assertEquals(4, ArithmeticOperations.add(2, 2));
    }

    @Test
    void sub() {
        assertEquals(0, ArithmeticOperations.sub(2, 2));
    }

    @Test
    void mul() {
        assertEquals(6, ArithmeticOperations.mul(2, 3));
    }

    @Test
    void div() {
        assertEquals(2, ArithmeticOperations.div(8, 4));
    }

    @Test
    void toFloat() {
        assertEquals("2.33", ArithmeticOperations.
                toFloatingPoint(7, 3));
    }


}