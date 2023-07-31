package sem4.ex001;

public class Gen<T> {
    private T ob; // Объявить объект типа T

    public Gen(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    public void showType() {
        System.out.println("Tип Т это " + ob.getClass().getName());
    }
}
