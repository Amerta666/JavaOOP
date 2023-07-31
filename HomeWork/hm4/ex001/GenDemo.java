package hm4.ex001;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(12);
        Gen<String> sOb = new Gen<>("Сообщение");
        Gen<Double> dOb = new Gen<>(15.75);

        iOb.printElement();
        sOb.printElement();
        dOb.printElement();
    }
}
