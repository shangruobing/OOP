package Test;

import Model.Cubic;
import Model.Equation;
import Model.Linear;
import Model.Quadratic;

public class Main {
    public static void main(String[] args) {
        Equation[] equations = new Equation[3];
        equations[0] = new Linear(3, -8);
        equations[1] = new Quadratic(5, 6, -9);
        equations[2] = new Cubic(1, 4, 2, -5);

        for (Equation eq : equations) {
            System.out.println("The solution of " + eq + " is as follows:");
            for (int i = 0; i < eq.getResults().length; i++) {
                System.out.println("\tx[" + (i + 1) + "]= " + eq.getResults()[i]);
            }
        }
    }
}