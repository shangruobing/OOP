package Classwork.Complex;

public class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
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

    public Complex add(Complex number) {
        this.real += number.real;
        this.imaginary += number.imaginary;
        return new Complex(real, imaginary);
    }

    public Complex subtract(Complex number) {
        this.real -= number.real;
        this.imaginary -= number.imaginary;
        return new Complex(real, imaginary);
    }

    public Complex multiple(Complex number) {
        this.real = (this.real * number.real) - (this.imaginary * number.imaginary);
        this.imaginary = (this.imaginary * number.real) + (this.real * number.imaginary);
        return new Complex(real, imaginary);
    }

    public Complex division(Complex number) {
        this.real = ((this.real * number.real) + (this.imaginary * number.imaginary)) /
                (Math.pow(number.real, 2) + Math.pow(number.imaginary, 2));
        this.imaginary = ((this.imaginary * number.real) - (this.real * number.imaginary)) /
                (Math.pow(number.real, 2) + Math.pow(number.imaginary, 2));
        return new Complex(real, imaginary);
    }

    public String toString() {
        if (this.imaginary >= 0)
            return this.real + "+" + this.imaginary + "i";
        else
            return this.real + "" + this.imaginary + "i";
    }
}
