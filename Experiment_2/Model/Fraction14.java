package Experiment_2.Model;

import Experiment_1.Model.Complex14;

/**
 * @author 冰
 */
public class Fraction14 {
    private int numerator;
    private int denominator;

    public Fraction14() {
    }

    public Fraction14(double numerator, double denominator) {
        this.numerator = (int) (numerator * Math.pow(10, getLength(denominator, numerator)));
        this.denominator = (int) (denominator * Math.pow(10, getLength(denominator, numerator)));
    }

    public int getGcd() {
        //辗转相除法 欧几里得算法 求最大公约数GCD
        int a = numerator;
        int b = denominator;
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public int getLength(double a, double b) {
        int num1, num2;
        num1 = String.valueOf(a).length() - String.valueOf(a).indexOf(".");
        num2 = String.valueOf(b).length() - String.valueOf(b).indexOf(".");
        return Math.max(num1, num2);
    }

    public int simplify(int number) {
        return Math.abs(number / getGcd());
    }

    @Override
    public String toString() {
        String result = simplify(numerator) + "/" + simplify(denominator);
        if (denominator == 0) {
            return "分母不能为0";
        }
        if (numerator == 0) {
            return "0";
        }

        if (denominator * numerator < 0) {
            if (simplify(denominator) == 1) {
                return "-" + simplify(numerator);
            }
            return "-" + result;
        } else {
            if (simplify(denominator) == 1) {
                return String.valueOf(simplify(numerator));
            }
            return result;
        }
    }

    public Complex14 multiple(Complex14 complex) {
        int value = numerator / denominator;
        if (complex.getImaginary() != 0) {
            return new Complex14(complex.getReal() * value, complex.getImaginary() * value);
        } else {
            return new Complex14(complex.getReal() * value);
        }
    }

}
