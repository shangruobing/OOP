package Experiment_4;

public class Formula {
    private double a;
    private double b;
    private static Formula formula;

    public static Formula getInstance() {
        if (formula == null)
            formula = new Formula();
        return formula;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
