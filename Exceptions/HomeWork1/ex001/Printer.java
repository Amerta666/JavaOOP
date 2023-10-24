package HomeWork1.ex001;

class Answer {
    public static void arrayOutOfBoundsException() {
            int[] array = {1, 2, 3};
            System.out.println(array[3]);
    }

    public static void divisionByZero() {
            int a = 3;
            int b = 0;
            int result = a / b;
            System.out.println(result);
    }

    public static void numberFormatException() {
        String numberString = "abc";
        int number = Integer.parseInt(numberString);
    }
}

public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}