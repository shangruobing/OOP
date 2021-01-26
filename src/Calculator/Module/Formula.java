package Calculator.Module;

public class Formula {
    private double a;
    private double b;
    private double c;
    private static Formula formula;

    private Formula() {
    }

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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
