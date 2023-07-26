package sem3.ex003;

public class Main {
    public static void main(String[] args) {
        ITest<Integer> test = (n, d) -> n % d == 0;
        ITest<Double> test1 = (k, l) -> k > l;
        ITest<String> test3 = (r, m) -> r.equals(m);

        System.out.println(test.test(15, 3));
        System.out.println(test1.test(20.98, 23.12));
        System.out.println(test3.test("Ivan", "Ivan"));
    }
}
