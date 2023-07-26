package sem3.ex001;

public class Main {
    public static void main(String[] args) {
        ImyValue value;
        ImyValue1 value1;
        value1 = (m, n) -> m / n;
        System.out.println(value1.getValue(10.0, 2.0));
    }
}
