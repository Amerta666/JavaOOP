package sem6.ex003Liscov.L2;

class Rectangle2 {
    protected int width;
    protected int height;

    public void setDimensions(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square2 extends Rectangle2 {
    @Override
    public void setDimensions(int width, int height) {
// Предположим, что у нас есть такое ограничение:
// В квадрате ширина и высота всегда равны
        int size = Math.max(width, height);
        this.width = size;
        this.height = size;
    }
}