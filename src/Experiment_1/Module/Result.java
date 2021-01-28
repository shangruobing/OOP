package Experiment_1.Module;

public class Result {
    private double root;
    private double imaginary;

    public double getDelta() {
        return Math.pow(Formula.getInstance().getB(), 2) -
                4 * Formula.getInstance().getA() * Formula.getInstance().getC();
    }

    public void setRoot(double root) {
        this.root = root;
    }

    public double getRoot() {
        root = -1 * Formula.getInstance().getB() / (2 * Formula.getInstance().getA());
        return root;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public double getImaginary() {
        imaginary = Math.sqrt(Math.abs(getDelta())) / (2 * Formula.getInstance().getA());
        return imaginary;
    }

    public String toString() {
        if (Formula.getInstance().getA() == 0)
            if (Formula.getInstance().getB() != 0)
                return "X = " + (-Formula.getInstance().getC()) / Formula.getInstance().getB();
            else
                return "ERROR";
        if (getDelta() > 0)
            return "X1 = " + (root + imaginary) + " X2 = " + (root - imaginary);
        if (getDelta() == 0)
            return "X1 = X2 = " + (root + imaginary);
        if (getDelta() < 0)
            return "X = " + root + " ± " + imaginary + " i";
        return "ERROR";
    }
}