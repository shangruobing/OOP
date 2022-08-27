package Experiment_3;

/**
 * @author 冰
 */
public class FinalExample14 {


    public static void main(String[] args) {
        Person14 xx1=new Person14("冰","Kunming");
        Person14 xx2=new Person14("冰","Kunming");
        System.out.println(xx1==xx2);
        System.out.println(xx1.equals(xx2));
    }
}
