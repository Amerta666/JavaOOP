package sem2.Ex001;

public class Program {
    public static void main(String[] args) {
        Test test1 = new Test();
        System.out.println("Работу начинает test1");
        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение - " + test1.getNext());
        }
        System.out.println("Сброс");
        test1.reset();

        test1.setStart (100);
        System.out.println("Начальное значение - " + test1.start);
        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение - " + test1.getNext());
        }
        System.out.println();
        System.out.println("Работу начинает test2");
        Test2 test2 = new Test2();
        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение - " + test2.getNext());
        }
        System.out.println("Сброс");
        test2.reset();

        test2.setStart (200);
        System.out.println("Начальное значение - " + test2.start);
        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение - " + test2.getNext());
        }
    }
}
