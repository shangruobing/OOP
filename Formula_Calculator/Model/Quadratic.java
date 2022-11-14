package Model;

public class Quadratic extends Equation {

    public Quadratic(double a, double b, double c) {
        coefs = new double[3];
        coefs[0] = a;
        coefs[1] = b;
        coefs[2] = c;
    }

    @Override
    public Complex[] getResults() {
        Complex[] results = new Complex[2];

        if (getDelta() >= 0) {
            results[0] = new Complex((-coefs[1] + Math.sqrt(getDelta())) / (2 * coefs[0]));
            results[1] = new Complex((-coefs[1] - Math.sqrt(getDelta())) / (2 * coefs[0]));
        } else {
            results[0] = new Complex(-coefs[1] / (2 * coefs[0]), Math.sqrt(-getDelta()) / (2 * coefs[0]));
            results[1] = new Complex(-coefs[1] / (2 * coefs[0]), Math.sqrt(-getDelta()) / (-2 * coefs[0]));
        }

        return results;
    }

    private double getDelta() {
        return Math.pow(coefs[1], 2) - 4 * coefs[0] * coefs[2];
    }
}
