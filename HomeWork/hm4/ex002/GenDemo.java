package hm4.ex002;

public class GenDemo {

    public static <T> void printArray(T[] array) {
        System.out.println("Тип эл-ов массива: " + array[0].getClass().getSimpleName());
        for (T item : array) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Integer[] iArr = {10, 15, 25, 4, 59};
        String[] sArr = {"Process", "finished", "with", "exit", "code" , "0"};
        Double[] dArr = {10.5, 15.21, 25.06, 4.3, 59.1};

        System.out.println("====".repeat(15));
        printArray(iArr);
        System.out.println("====".repeat(15));
        printArray(sArr);
        System.out.println("====".repeat(15));
        printArray(dArr);
        System.out.println("====".repeat(15));
    }
}
