package Experiment_4;

public class Result {
    private double denominator; //分母
    private double numerator; //分子

    public double getDenominator() {
        return denominator;
    }

    public void setDenominator(double denominator) {
        this.denominator = denominator;
    }

    public double getNumerator() {
        return numerator;
    }

    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

    public double getGCD() {  //辗转相除法 欧几里得算法 求最大公约数GCD
        double a = denominator * 10000;  //将小数变为整数求公约数
        double b = numerator * 10000;
        double r; //余数
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        //System.out.println(denominator + "与" + numerator + "的最大公约数为" + a/10000);
        return a / 10000;
    }

    public double getRoot() {
        return - numerator / denominator;
    }

    public String toFraction() {
        if (denominator == 0)  //分母为0
            return "非法方程";
        //方程系数a b异号
        if ((denominator > 0 && numerator < 0) || (denominator < 0 && numerator > 0)) {
            if (Math.abs(denominator / getGCD()) == 1)
                return "此方程的解为:" + (int) (Math.abs(numerator / getGCD()));

            return "此方程的解为:" + (int) (Math.abs(numerator / getGCD())) + "/"
                    + (int) (Math.abs(denominator / getGCD()));
        }
        //方程系数a b同号
        else if (Math.abs(denominator / getGCD()) == 1)
            return "此方程的解为:" + (int) (-numerator / getGCD());
        return "此方程的解为:" + (int) (-numerator / getGCD()) + "/" + (int) (denominator / getGCD());
    }

}
