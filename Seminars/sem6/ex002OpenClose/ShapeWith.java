package sem6.ex002OpenClose;

abstract class ShapeWith {
    public abstract void draw();
}

class Circle extends ShapeWith {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends ShapeWith {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

class Triangle extends ShapeWith {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle.");
    }
}

class Square extends ShapeWith {
    @Override
    public void draw() {
        System.out.println("Drawing a square.");
    }
}