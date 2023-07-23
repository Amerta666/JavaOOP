package sem2.ex001;

public class Test2 implements INumeric {

    int start;
    int val;

    public Test2() {
        start = 0;
        val = 0;
    }

    @Override
    public void reset() {
        start = 100;
        val = 100;
    }

    @Override
    public int getNext() {
        val += 10;
        return val;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
    }
}
