package Experiment_5;

import java.util.Arrays;

public class Rectangle extends Shape {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;
    private double length;
    private double width;

    public Rectangle(Point pointA, Point pointB, Point pointC, Point pointD) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.pointD = pointD;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public boolean equals() {
        return (pointA.equals(pointB) || pointA.equals(pointC) || pointA.equals(pointD)
                || pointB.equals(pointC)|| pointB.equals(pointD)|| pointC.equals(pointD));
    }

    private boolean checkValid() { //判断4个坐标是否有效
        int count = 0;
        double[] length = new double[3]; //记录3条线段 长 宽 对角线
        double[] side = new double[]{super.getLength(pointA, pointB), super.getLength(pointA, pointC),
                super.getLength(pointA, pointD), super.getLength(pointB, pointC),
                super.getLength(pointB, pointD), super.getLength(pointC, pointD)};
        Arrays.sort(side); // 对6条线段长度进行排序
        for (int i = 0; i < side.length - 1; i++)
            if (side[i] == side[i + 1])
                count++;
        if (count == 3) {
            int j = 0;
            for (int i = 0; i < side.length - 1; i++) {
                if (side[i] == side[i + 1]) {
                    length[j] = side[i];
                    j++;
                }
            }
            setWidth(length[0]);
            setLength(length[1]);
            return (String.format("%.4f", length[2] * length[2])).equals
                    (String.format("%.4f", (length[0] * length[0] + length[1] * length[1])));
        }
        return false;
    }

    public double getPerimeter() {
        if (equals())
            return 0;
        if (!equals() && checkValid())
            return (getLength() + getWidth()) * 2;

        return 0;
    }

    public double getArea() {
        if (equals())
            return 0;
        if (!equals() && checkValid())
        return (getLength() * getWidth());
        return 0;
    }

    public String toString() {
        return "矩形{" + pointA.toString() + pointB.toString() +
                pointC.toString() + pointD.toString() + "}";
    }
}
