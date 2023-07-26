package sem3.ex002;

public class Main {
    public static void main(String[] args) {
        ImyValue value;
        ImyValue myValue2;
        ImyValue myValue3;
        value = (m, n) -> {
            if ( 1 > 0) {
                System.out.println("1 > 0");
            }
            return m / n;
        };
        myValue2 = (x, y) -> x + y;
        myValue3 = (x, y) -> x * y;
        System.out.println(value.getValue(10.0, 2.0));
        System.out.println(myValue2.getValue(10.0, 2.0));
        System.out.println(myValue3.getValue(10.0, 2.0));
    }
}
