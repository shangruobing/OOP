package Experiment_2.Model;

/**
 * @author 冰
 */
public class Formula14 {
    private double a;
    private double b;
    private Fraction14 root;

    public Formula14() {
        a = 3;
        b = 4;
    }

    public Formula14(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setRoot() {
        root = new Fraction14(-b, a);
    }

    public Fraction14 getRoot() {
        return root;
    }

}
