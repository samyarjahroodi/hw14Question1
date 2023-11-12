import java.text.DecimalFormat;

public class ArithmeticOperations {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("b shouldn't be 0");
        }
        return a / b;
    }

    public static String toFloatingPoint(float a, float b) {
        if (b == 0) {
            throw new ArithmeticException("b shouldn't be 0");
        }
        float result = a / b;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return decimalFormat.format(result);
    }
}
