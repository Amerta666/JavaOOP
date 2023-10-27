package HomeWork2.ex003;

class Expr {

    public static double expr(int a, int b) {
        printSum(a, b);
        if (b != 0) return (double) a / b; {
        }
        return 0;
    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public class Printer {
    public static void main(String[] args) {
        int a;
        int b;

        if (args.length == 0) {
            a = 12;
            b = 0; // Default values if no arguments are provided
        } else {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        }

        double result = Expr.expr(a, b);
        System.out.println(result);
    }
}
