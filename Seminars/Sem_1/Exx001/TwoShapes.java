package Sem_1.Exx001;

public class TwoShapes {
    private double width;
    private double height;

    public TwoShapes(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public TwoShapes() {
        width = height = 0.0;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void ShowDim() {
        System.out.println("Ширина - " + width);
        System.out.println("Высота - " + height);
    }

}

class Triangle extends TwoShapes {
    String style;

    public Triangle(double width, double height, String style) {
        super(width, height);
        this.style = style;
    }

    Triangle(double width, double height) {
        super(width, height);
    }

    double area () {
        return getWidth() * getHeight() / 2;
    }

    public void showStyle() {
        System.out.println("Треугольник - " + style);
    }
}