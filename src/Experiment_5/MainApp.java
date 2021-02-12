package Experiment_5;

public class MainApp {
    public static void main(String[] args) {
        Complex a,b,c;        //声明三个复数引用
        a=new Complex(1,5.5); // a的值为1+5.5i
        b=new Complex(1,-2);  //b的值为1-2i
        c=a.add(b);           //c=a+b
        System.out.println(c);//
    }
}
