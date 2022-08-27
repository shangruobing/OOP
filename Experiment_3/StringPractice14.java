package Experiment_3;

import java.util.Vector;

/**
 * @author 冰
 */
public class StringPractice14 {
    public static void main(String[] args) {
        String s = new String("Hello");
        s = s.concat("World");
        System.out.println(s);
        s = s + "World";
        System.out.println(s);
        Vector<String> v = new Vector<String>();
        v.add("World");
        System.out.println("Hello" + v);
    }
}
