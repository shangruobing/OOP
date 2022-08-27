package Experiment_1.Model;
/**
 * @author 冰
 */
public class Complex14 {
    private final double real;
    private final double imaginary;

    public Complex14() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    public Complex14(double real) {
        this.real = real;
        this.imaginary = 0;
    }

    public Complex14(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public Complex14 multiple(double x) {
        return new Complex14(real * x, imaginary * x);
    }

    @Override
    public String toString() {
        if (Double.compare(imaginary, 0) == 0) {
            return "" + real;
        } else {
            return "" + real + String.format("%+f", imaginary) + "i";
        }
    }
}