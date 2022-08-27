package Experiment_6;

/**
 * @author 冰
 */
public class TestApp14 {
    public static void main(String[] args) {

        Shape14 shape1 = new Triangle14(3, 4, 6);
        System.out.printf("三角形面积：" + "%.2f", shape1.getArea());

        Shape14 shape2 = new Parallelogram14(3, 6, 60);
        System.out.printf("\n平行四边形面积：" + "%.2f", shape2.getArea());

        Shape14 shape3 = new IsoscelesTriangle14(6, 5);
        System.out.printf("\n等腰三角形面积：" + "%.2f", shape3.getArea());

        Shape14 shape4 = new EquilateralTriangle14(5);
        System.out.printf("\n等边三角形面积：" + "%.2f", shape4.getArea());

        Shape14 shape5 = new Rectangle14(5, 7);
        System.out.printf("\n矩形面积：" + "%.2f", shape5.getArea());

        Shape14 shape6= new Square14(5);
        System.out.printf("\n正方形面积：" + "%.2f", shape6.getArea());

        double sumOfArea=0;
        Shape14 [] shapes=new Shape14[]{shape1,shape2,shape3,shape4,shape5,shape6};
        for (Shape14 shape:shapes) {
            sumOfArea+=shape.getArea();
        }
        System.out.printf("\n面积总和：%.2f", sumOfArea);
    }
}
