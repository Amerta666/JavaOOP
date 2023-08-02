package sem4.ex002;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer,String> myOb = new Gen<Integer, String>(88);
        myOb.showType();
        int v = myOb.getOb();
        System.out.println("Значение: " + v);
        String str = myOb.getOb2();
        System.out.println("Значение: " + str);
    }
}
