package hm2.ex001;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(7.4, 4.15);

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
    }
}
