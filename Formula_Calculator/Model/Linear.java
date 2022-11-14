package Model;

public class Linear extends Equation {

    public Linear(double a, double b) {
        coefs = new double[2];
        coefs[0] = a;
        coefs[1] = b;
    }

    @Override
    public Complex[] getResults() {
        Complex root = new Complex();
        root.setReal(-coefs[1] / coefs[0]);
        return new Complex[]{root};
    }
}