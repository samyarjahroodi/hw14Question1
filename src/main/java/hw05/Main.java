package hw05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1
        Scanner scanner = new Scanner(System.in);
        System.out.println("write numerator");
        int numerator = scanner.nextInt();
        System.out.println("write denominator");
        int denominator = scanner.nextInt();
        Rational rational = new Rational(numerator, denominator);
        System.out.println("First ratio " + rational);
        rational.simplify();
        System.out.println("Final ratio " + rational);
        //2
        System.out.println("write the second numerator");
        int numerator1 = scanner.nextInt();
        System.out.println("write the second denominator");
        int denominator2 = scanner.nextInt();
        Rational rational1 = new Rational(numerator1, denominator2);
        rational1.simplify();
        System.out.println(rational1);
        Rational result = rational.add(rational1);
        result.simplify();
        System.out.println("Result of addition: " + result);
        //3
        Rational result1 = rational1.sub(rational);
        result1.simplify();
        System.out.println("Result of subtraction " + result1);
        //4
        Rational result2 = rational1.mul(rational);
        result2.simplify();
        System.out.println("Result of multiply " + result2);
        //5
        Rational result3 = rational.div(rational1);
        result3.simplify();
        System.out.println("Result of the division is " + result3);
        //6
//        rational.toFloatingPoint();
        System.out.println("Result of floating point" + rational.toFloatingPoint());
        //7
        System.out.println("Result of the to string " + rational.toString1());
        //8
        System.out.println("Result of the mix number is "+rational.mixedNumber());
    }
}
