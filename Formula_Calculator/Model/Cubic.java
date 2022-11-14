package Model;


public class Cubic extends Equation {
    public Cubic(double a, double b, double c, double d) {
        coefs = new double[4];
        coefs[0] = a;
        coefs[1] = b;
        coefs[2] = c;
        coefs[3] = d;
    }

    /**
     * Solution of unary cubic equation: "Shengjin formula"
     * Shengjin formula discriminant
     * When A=B=0, the equation has a triple real root.
     * When Δ=B^2-4AC>0, the equation has a real root and a pair of conjugate virtual roots.
     * When Δ=B^2-4AC=0, the equation has three real roots, one of which is a double root.
     * When Δ=B^2-4AC<0, the equation has three unequal real roots.
     */
    @Override
    public Complex[] getResults() {
        if (getDiscriminantA() == 0 && getDiscriminantB() == 0) {
            return coefficientEqualsZero();
        }
        if (getDelta() > 0) {
            return discriminantGraterThanZero();
        }
        if (getDelta() == 0) {
            return discriminantEqualsZero();
        }
        if (getDelta() < 0) {
            return discriminantLessThanZero();
        }
        return new Complex[0];
    }

    private double getA() {
        return coefs[0];
    }

    private double getB() {
        return coefs[1];
    }

    private double getC() {
        return coefs[2];
    }

    private double getD() {
        return coefs[3];
    }

    /**
     * A = b^2-3ac
     */
    private double getDiscriminantA() {
        return Math.pow(getB(), 2) - 3 * getA() * getC();
    }

    /**
     * B = bc-9ad
     */
    private double getDiscriminantB() {
        return getB() * getC() - 9 * getA() * getD();
    }

    /**
     * C = c^2-3bd
     */
    private double getDiscriminantC() {
        return Math.pow(getC(), 2) - 3 * getB() * getD();
    }

    /**
     * Total Discriminant: Δ = B^2-4AC
     */
    private double getDelta() {
        return Math.pow(getDiscriminantB(), 2) - 4 * getDiscriminantA() * getDiscriminantC();
    }

    /**
     * when A=B=0
     * X1=X2=X3= -b/3a = -c/b = -3d/c
     * example: a=1,b=3,c=3,d=1
     */
    private Complex[] coefficientEqualsZero() {
        Complex root = new Complex(-getB() / (3 * getA()));
        return new Complex[]{root, root, root};
    }

    /**
     * when Δ>0,
     * X1= (-b-(³√Y₁+³√Y₂)) / 3a
     * X2=X3= (-b + 1/2(³√Y₁+³√Y₂) ± ³√3(³√Y₁-³√Y₂)) / 3a
     * Y₁,₂= Ab+3a((-B±√(B^2-4AC))/2) , i^2=-1
     * example: a=1,b=4,c=2,d=-5
     */
    private Complex[] discriminantGraterThanZero() {
        double y1 = getDiscriminantA() * getB() + 1.5 * getA() * (-getDiscriminantB() + Math.sqrt(getDelta()));
        double y2 = getDiscriminantA() * getB() + 1.5 * getA() * (-getDiscriminantB() - Math.sqrt(getDelta()));
        y1 = Math.cbrt(y1);
        y2 = Math.cbrt(y2);
        Complex root1 = new Complex((-getB() - (y1 + y2)) / (3 * getA()));
        Complex root2 = new Complex();
        double real = (-getB() + (0.5 * (y1 + y2))) / (3 * getA());
        double imaginary = (Math.sqrt(3) / 2) * (y1 - y2);
        root2.setReal(real);
        root2.setImaginary(imaginary / (3 * getA()));
        Complex root3 = new Complex();
        root3.setReal(real);
        root3.setImaginary(-imaginary / (3 * getA()));
        return new Complex[]{root1, root2, root3};
    }

    /**
     * when Δ=0,
     * X1= -b/a + K
     * X2=X3= -K/2
     * K= B/A
     */
    private Complex[] discriminantEqualsZero() {
        double k = getB() / getA();
        Complex root1 = new Complex((-getB() / getA() + k));
        Complex root2 = new Complex(-k / 2);
        return new Complex[]{root1, root2, root2};
    }

    /**
     * when Δ<0,
     * X1=  (-b-2√A*cos(θ/3)) / 3a
     * X2=X3= (-b+√A(cos(θ/3)±√3sin(θ/3))) / 3a
     * θ=arccosT
     * T= (2Ab-3aB) / 2√A^3
     * example: a=-1,b=4,c=2,d=-5
     */
    private Complex[] discriminantLessThanZero() {
        double t = (2 * getDiscriminantA() * getB() - 3 * getA() * getDiscriminantB())
                / (2 * Math.sqrt(Math.pow(getDiscriminantA(), 3)));
        double theta = Math.acos(t);
        double sqrtA = Math.sqrt(getDiscriminantA());
        Complex root1 = new Complex((-getB() - 2 * sqrtA * Math.cos(theta / 3)) / (3 * getA()));
        Complex root2 = new Complex();
        root2.setReal((-getB() + sqrtA * (Math.cos(theta / 3) + Math.sqrt(3) * Math.sin(theta / 3))) / (3 * getA()));
        Complex root3 = new Complex();
        root3.setReal((-getB() + sqrtA * (Math.cos(theta / 3) - Math.sqrt(3) * Math.sin(theta / 3))) / (3 * getA()));
        return new Complex[]{root1, root2, root3};
    }
}
