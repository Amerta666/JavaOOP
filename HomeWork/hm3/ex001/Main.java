package hm3.ex001;

public class Main implements IConst {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 15);
        Rectangle r2 = new Rectangle(7.4, 4.15);
        Cube c1 = new Cube(20);

        System.out.println("Прямоуголник r1");
        System.out.println("Ширина - " + r1.width + ", Высота - " + r1.height);
        System.out.print("Площадь - ");
        System.out.println(r1.calculateArea());
        System.out.print("Периметр - ");
        System.out.println(r1.calculatePerimeter());
        System.out.println();
        System.out.println("Прямоуголник r2");
        System.out.println("Ширина - " + r2.width + ", Высота - " + r2.height);
        System.out.print("Площадь - ");
        System.out.println(r2.calculateArea());
        System.out.print("Периметр - ");
        System.out.println(r2.calculatePerimeter());
        System.out.println();
        if (c1.width > MAX_SIDE) {
            System.out.println(ERROR);
        } else {
            System.out.println("Куб с1");
            System.out.println("Ширина - " + c1.width + ", Высота - " + c1.height);
            System.out.print("Площадь - ");
            System.out.println(c1.calculateArea());
            System.out.print("Периметр - ");
            System.out.println(c1.calculatePerimeter());
        }

        System.out.println();
        System.out.println("Фунциональный интерфейс");
        IValue area;
        IValue perimeter;
        area = (x, y) -> x * y;
        perimeter = (x, y) -> 2 * (x + y);
        System.out.println("Площадь r1 - " + area.getValue(r1.width, r1.height));
        System.out.println("Периметр r1 - " + perimeter.getValue(r1.width, r1.height));


    }
}
