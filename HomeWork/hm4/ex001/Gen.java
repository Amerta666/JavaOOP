package hm4.ex001;

public class Gen<T> {
    private T ob;

    public Gen(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    public void printElement() {
        System.out.println(getOb());
    }
}
