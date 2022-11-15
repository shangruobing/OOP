package Model;

public abstract class Equation {
    protected double coefs[];

    public abstract Complex[] getResults();

    @Override
    final public String toString() {
        StringBuilder formula = new StringBuilder();
        int power = coefs.length - 1;
        for (double coef : coefs) {
            String number = simplifyOne(coef);
            number = addPrefixPlus(number);
            formula.append(appendSuffixVariable(power, number));
            power--;
        }
        String equation = appendSuffixZero(String.valueOf(formula));
        equation = removePrefixPlus(equation);
        return equation;
    }

    private String addPrefixPlus(String coef) {
        String number;
        if (coef.equals("-") || coef.equals("")) {
            return coef;
        }
        if (Double.parseDouble(coef) > 0) {
            number = "+" + coef;
        } else {
            number = coef;
        }
        return number;
    }

    private String simplifyOne(double coef) {
        String number = String.valueOf(coef);
        if (coef == 1) {
            number = "";
        }
        if (coef == -1) {
            number = "-";
        }
        return number;
    }

    private String removePrefixPlus(String formula) {
        String prefix = formula.substring(0, 1);
        if (prefix.equals("+")) {
            formula = formula.substring(1);
        }
        return formula;
    }

    private String appendSuffixZero(String formula) {
        return formula + " = 0";
    }

    private String appendSuffixVariable(int power, String number) {
        String formula;
        switch (power) {
            case 0:
                formula = number;
                break;
            case 1:
                formula = number + "X ";
                break;
            default:
                formula = number + "X^" + power + " ";
        }
        return formula;
    }

}