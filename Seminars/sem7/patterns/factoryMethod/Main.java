package sem7.patterns.factoryMethod;

public class Main {
    public static void main(String[] args) {
        IShapeFactory circleFactory = new CircleFactory();
        IShapeFactory squareFactory = new SquareFactory();

        Shape circle = circleFactory.createShape();
        Shape square = squareFactory.createShape();

        circle.draw(); // Выведет: Drawing a circle
        square.draw(); // Выведет: Drawing a square
    }
}
