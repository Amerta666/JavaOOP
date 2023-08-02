package sem4.ex002;

public class Gen<T, V> {
    private T ob; // Объявить объект типа T
    private V ob2; // Объявить объект типа V

    public Gen(T ob) {

        this.ob = ob;
        this.ob2 = ob2;
    }

    public T getOb() {
        return ob;
    }

    public V getOb2() {
        return ob2;
    }

    public void showType() {
        System.out.println("Tип Т это " + ob.getClass().getName());
        System.out.println("Tип V это " + ob2.getClass().getName());
    }
}
