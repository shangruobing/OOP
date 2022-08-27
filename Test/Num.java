package Test;

public class Num {

    public int getLength(double a, double b) {
        String num1, num2;
        num1 = String.valueOf(a);
        num2 = String.valueOf(b);
        int x1, x2;
        x1 = num1.length() - num1.indexOf(".") - 1;
        x2 = num2.length() - num2.indexOf(".") - 1;
        return Math.max(x1, x2);
    }

    public static void main(String[] args) {
        Num num = new Num();
        System.out.println(330/(-110));
    }
}
