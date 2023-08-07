package sem6.ex002OpenClose;

public class ShapeWithout {
    private String type;

    public ShapeWithout(String type) {
        this.type = type;
    }

    public void draw() {
        if (type.equals("circle")) {
            drawCircle();
        } else if (type.equals("rectangle")) {
            drawRectangle();
        } else if (type.equals("triangle")) {
            drawTriangle();
        } else {
            System.out.println("Unsupported shape type.");
        }
    }

    private void drawCircle() {
        System.out.println("Drawing a circle.");
    }

    private void drawRectangle() {
        System.out.println("Drawing a rectangle.");
    }

    private void drawTriangle() {
        System.out.println("Drawing a triangle.");
    }
}
