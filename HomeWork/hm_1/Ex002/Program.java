package hm_1.Ex002;

public class Program {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(7.4, 4.15);

        System.out.println("Прямоуголник r1");
        System.out.println("Ширина - " + r1.getWidth() + ", Высота - " + r1.getHeight());
        System.out.print("Площадь - ");
        System.out.println(r1.calculateArea());
        System.out.print("Периметр - ");
        System.out.println(r1.calculatePerimeter());
        System.out.println();
        System.out.println("Прямоуголник r2");
        System.out.println("Ширина - " + r2.getWidth() + ", Высота - " + r2.getHeight());
        System.out.print("Площадь - ");
        System.out.println(r2.calculateArea());
        System.out.print("Периметр - ");
        System.out.println(r2.calculatePerimeter());
    }
}
