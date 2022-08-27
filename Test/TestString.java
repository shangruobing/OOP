package Test;

import java.util.Objects;

/**
 * @author 冰
 */
public class TestString {
    private double num1;
    private double num2;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TestString)) return false;
        TestString that = (TestString) o;
        return Double.compare(that.num1, num1) == 0 && Double.compare(that.num2, num2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num1, num2);
    }

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);
        String s3 = new String("hello");
        String s4 = new String("hello");
        System.out.println(s3 == s4);
        System.out.println(s1 == s3);

    }
}
