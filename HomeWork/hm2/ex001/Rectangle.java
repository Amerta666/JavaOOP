package hm2.ex001;

public class Rectangle implements IRectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this.width = Width();
        this.height = Height();
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() { return  2 * (width + height); }
}
