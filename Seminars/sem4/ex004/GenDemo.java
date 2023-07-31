package sem4.ex004;

public class GenDemo {
    public static void test(Gen<? super D> o) {
        //
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        Gen<A> aGen = new Gen<>(a);
        Gen<B> bGen = new Gen<>(b);
        Gen<C> cGen = new Gen<>(c);
        Gen<D> dGen = new Gen<>(d);

        test(aGen);
        test(bGen);
        test(cGen);
        test(dGen);
    }
}
