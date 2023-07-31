package sem4.ex002;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> integerGen;
        integerGen = new Gen<Integer>(88);
        integerGen.showType();
        int v = integerGen.getOb();
        System.out.println("Значение: " + v);
        System.out.println();

        Gen<String> stringGen;
        stringGen = new Gen<String>("Сообщение");
        stringGen.showType();
        String str = stringGen.getOb();
        System.out.println("Значение: " + str);
    }
}
