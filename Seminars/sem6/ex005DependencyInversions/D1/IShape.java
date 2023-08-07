package sem6.ex005DependencyInversions.D1;

public interface IShape {
    double getArea();
    double getPerimeter();
}

class Rectangle2 implements IShape {
    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
// Реализация методов getArea() и getPerimeter() как в примере выше
}

class Square2 implements IShape {
    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
// Реализация методов getArea() и getPerimeter() как в примере выше
}

class Circle2 implements IShape {
    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
// Реализация методов getArea() и getPerimeter() как в примере выше
}