package sem7.patterns.factoryMethod;

public interface IShapeFactory {
    Shape createShape();
}

class CircleFactory implements IShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}

class SquareFactory implements IShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}
