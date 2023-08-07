package sem6.ex005DependencyInversions.D1;

//public class AreaCalculator {
//    public double calculateRectangleArea(Rectangle rectangle) {
//        return rectangle.getArea();
//    }
//
//    public double calculateSquareArea(Square square) {
//        return square.getArea();
//    }
//
//    public double calculateCircleArea(Circle circle) {
//        return circle.getArea();
//    }
//}


public class AreaCalculator {
    public double calculateArea(IShape shape) {
        return shape.getArea();
    }

    public double calculatePerimeter(IShape shape) {
        return shape.getPerimeter();
    }
}
