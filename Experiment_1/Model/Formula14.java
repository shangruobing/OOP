package Experiment_1.Model;
/**
 * @author 冰
 */
public class Formula14 {
    private double a;
    private double b;
    private double c;
    private final Complex14[] result = new Complex14[2];

    public Formula14() {
        a = 1;
        b = 2;
        c = 3;
    }

    public Formula14(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDelta() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public Complex14[] getResult() {
        return result;
    }

    public void setResult() {
        if (getDelta() >= 0) {
            result[0] = new Complex14((-b + Math.sqrt(getDelta())) / (2 * a));
            result[1] = new Complex14((-b - Math.sqrt(getDelta())) / (2 * a));
        } else {
            result[0] = new Complex14(-b / (2 * a), Math.sqrt(-getDelta()) / (2 * a));
            result[1] = new Complex14(-b / (2 * a), Math.sqrt(-getDelta()) / (-2 * a));
        }
    }

    @Override
    public String toString() {
        if (a == 0) {
            return "方程非法";
        }
        if (getDelta() != 0) {
            return "X1 = " + (result[0] + " X2 = " + result[1]);
        }
        if (getDelta() == 0) {
            return "X1 = X2 = " + (result[0]);
        }
        return "ERROR";
    }
}
