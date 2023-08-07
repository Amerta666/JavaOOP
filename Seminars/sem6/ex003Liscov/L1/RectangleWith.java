package sem6.ex003Liscov.L1;

class RectangleWith {
    protected int width;
    protected int height;

    public RectangleWith(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class SquareWith {
    private RectangleWith rectangle;

    public SquareWith(int size) {
        this.rectangle = new RectangleWith(size, size);
    }

    public void setSize(int size) {
        rectangle.setWidth(size);
        rectangle.setHeight(size);
    }

    public int getArea() {
        return rectangle.getArea();
    }
}
