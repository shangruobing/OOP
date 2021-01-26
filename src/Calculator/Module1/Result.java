package Calculator.Module1;

public class Result {
    public double getDelta() {
        return Math.pow(Formula.getInstance().getB(), 2) -
                4 * Formula.getInstance().getA() * Formula.getInstance().getC();
    }

    public double getRoot() {
        return Formula.getInstance().getB() / -2 * Formula.getInstance().getA();
    }

    public double getImaginary() {
        return Math.sqrt(Math.abs(getDelta())) / 2 * Formula.getInstance().getA();
    }

    public String toString() {
        if (Formula.getInstance().getA() == 0)
            return "X = " + (-Formula.getInstance().getC()) / Formula.getInstance().getB();
        if (getDelta() > 0)
            return "X1 = " + (getRoot() + getImaginary()) + " X2 = " + (getRoot() - getImaginary());
        if (getDelta() == 0)
            return "X1 = X2 = " + (getRoot() + getImaginary());
        if (getDelta() < 0)
            return "X = " + getRoot() + " ± " + getImaginary() + " i";
        return "ERROR";
    }
}