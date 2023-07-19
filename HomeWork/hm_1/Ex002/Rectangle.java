package hm_1.Ex002;

public class Rectangle {
    private double width;
    private double height;

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

    public Rectangle() {
        width = 5.0;
        height = 3.0;
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return getWidth() * getHeight();
    }

    public double calculatePerimeter() { return  2 * (getWidth() + getHeight()); }
}
