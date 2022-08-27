package Test;

/**
 * @author 冰
 */
public class Equals {
    public static void main(String[] args) {
        String str = "33";
        str = null;

        System.out.println(str.equals("33"));
        System.out.println("33".equals(str));
    }
}
