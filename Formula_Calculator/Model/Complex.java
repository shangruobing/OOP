package Model;

public class Complex {
    private double real;
    private double imaginary;

    public Complex() {
    }

    public Complex(double real) {
        this.real = real;
        this.imaginary = 0;
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex complex) {
        return new Complex(this.real + complex.getReal(),
                this.imaginary + complex.getImaginary());
    }

    public Complex subtract(Complex complex) {
        return new Complex(this.real - complex.getReal(),
                this.imaginary - complex.getImaginary());
    }

    public Complex multiply(Complex complex) {
        return new Complex(this.real * complex.getReal(),
                this.imaginary * complex.getImaginary());
    }

    public Complex divide(Complex complex) {
        return new Complex(this.real / complex.getReal(),
                this.imaginary / complex.getImaginary());
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        if (imaginary < 0) {
            return real + " " + imaginary + "i";
        }
        if (imaginary == 0) {
            return String.valueOf(real);
        }
        return real + " +" + imaginary + "i";
    }

    public static void main(String[] args) {
        Complex complex = new Complex();
        complex.setReal(2);
        complex.setImaginary(3);
        System.out.println(complex);
    }
}

