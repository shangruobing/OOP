package Experiment_5;

public class MainApp {
    public static void main(String[] args) {
        testTriangle();
        testCircle();
        testRectangle();
  /*       Rectangle rectangle = new Rectangle(new Point(3, 3),
                new Point(5, 3), new Point(3, 0), new Point(5, 0));
        Triangle triangles = new Triangle(new Point(0, 0),
                new Point(3, 0), new Point(0, 4));
        Circle c = new Circle(new Point(0, 0), 10);
        System.out.println("三角形、矩形、圆的面积和为：" +
                (rectangle.getArea() + triangles.getArea() + c.getArea()));
  */
    }

    public static void testTriangle() {
        Triangle[] triangles = new Triangle[4];
        triangles[0] = new Triangle(new Point(0, 0),
                new Point(3, 0), new Point(0, 4));
        triangles[1] = new Triangle(new Point(1, 2),
                new Point(3.5, 4.3), new Point(8.9, 10));
        triangles[2] = new Triangle(new Point(3.2, 4.3),
                new Point(3.2, 4.3), new Point(3.2, 4.3));
        triangles[3] = new Triangle(new Point(8.9, 10),
                new Point(3.2, 4.3), new Point(3.2, 4.3));

        for (Triangle triangle : triangles) {
            if (triangle.getPerimeter() == 0)
                System.out.println("有相同的点，不构成三角形！");
            else {
                System.out.print(triangle.toString());
                System.out.println("的周长=" + triangle.getPerimeter());
                System.out.println("面积=" + triangle.getArea());
            }
        }
    }

    public static void testCircle() {
        Circle c = new Circle(new Point(0, 0), 10);
        System.out.println("圆心为" + c.getCentre() + " " +
                "半径为" + c.getRadius() + "的圆的周长为" + c.getCircumference() + "面积为" + c.getArea());
    }

    public static void testRectangle() {
        Rectangle rectangle = new Rectangle(new Point(3, 3),
                new Point(5, 3), new Point(3, 0), new Point(5, 0));

        if (rectangle.getPerimeter() == 0)
            System.out.println("不构成矩形！");
        else {
            System.out.print(rectangle.toString());
            System.out.println("的周长=" + rectangle.getPerimeter());
            System.out.println("面积=" + rectangle.getArea());
        }
    }
}
