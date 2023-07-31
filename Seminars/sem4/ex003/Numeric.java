package sem4.ex003;

public class Numeric<T extends Number> {
    T num;

    public Numeric(T num) {
        this.num = num;
    }

    double reciprocal() {
        return 1 / num.doubleValue();
    }

    double fract() {
        return num.doubleValue() - num.intValue();
    }

}
