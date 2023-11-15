package hw05;


public class Rational {
    private int numerator;
    private int denominator;


    public Rational() {
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("you cannot continue!!!");
            System.exit(0);
        }
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator;
        this.denominator = denominator;

    }


    private static int gcd(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return number1;
    }


    public void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator = numerator / gcd;
        denominator = denominator / gcd;

    }

    @Override
    public String toString() {
        if (numerator == 0) {
            return "0";
        } else if (denominator == 1) {
            return Integer.toString(numerator);
        } else {
            return numerator + "/" + denominator;
        }
    }

    public Rational add(Rational rational2) {
        int resultNumerator = (this.numerator * rational2.denominator) + (rational2.numerator * this.denominator);
        int resultDenominator = this.denominator * rational2.denominator;

        return new Rational(resultNumerator, resultDenominator);
    }

    public Rational sub(Rational rational2) {
        int resultNumerator = (this.numerator * rational2.denominator) - (rational2.numerator * this.denominator);
        int resultDenominator = this.denominator * rational2.denominator;

        return new Rational(resultNumerator, resultDenominator);
    }

    public Rational mul(Rational rational2) {
        int resultNumerator = rational2.numerator * this.numerator;
        int resultDenominator = this.denominator * rational2.denominator;

        return new Rational(resultNumerator, resultDenominator);
    }

    public Rational div(Rational rational2) {
        int resultNumerator = this.numerator * rational2.denominator;
        int resultDenominator = this.denominator * rational2.numerator;

        return new Rational(resultNumerator, resultDenominator);
    }

    public double toFloatingPoint() {
        return (double) (numerator) / (double) (denominator);
    }

    public String toString1() {
        return this.numerator + "/" + this.denominator;
    }

    public String mixedNumber() {
        int result = this.numerator / this.denominator;
        int remainder = this.numerator % this.denominator;
        if (result == 0) {
            return Integer.toString(result);
        } else {
            return result + " " + remainder + "/" + this.denominator;
        }

    }
}