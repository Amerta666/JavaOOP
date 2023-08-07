package sem6.ex005DependencyInversions;

interface ShapeCalculator {
    double calculateArea(Shape shape);
    double calculatePerimeter(Shape shape);
}

class AreaCalculator implements ShapeCalculator {
    @Override
    public double calculateArea(Shape shape) {
        return shape.getArea();
    }

    @Override
    public double calculatePerimeter(Shape shape) {
        return shape.getPerimeter();
    }
}
