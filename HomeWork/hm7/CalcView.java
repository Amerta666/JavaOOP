package hm7;

import java.util.Scanner;

public class CalcView {
    Scanner input = new Scanner(System.in);

    private static MyLogger myLogger = new MyLogger("HomeWork/hm7/log.txt");

    public void greetings() {
        System.out.println("\nCalculator");
    }

    /**
     * @param value - результат вычисления
     */
    public void showOutput(double value) {
        System.out.println("Результат: " + value);
    }


    /**
     * @return - передача введённого символа в метод "calculate"
     */
    public char selectOperation() {
        System.out.println("Введите операцию(+, -, *, /): ");
        return input.next().charAt(0);
    }

    /**
     * @return - Передача введённого пользователем первого числа в метод "calculate".
     */
    public double getFirstNumber() {
        System.out.print("Введите первое число: ");
        if (input.hasNextDouble()) {
            return input.nextDouble();
        } else {
            myLogger.warning("Ввели не число");
            myLogger.info("---".repeat(15));
            throw new IllegalArgumentException("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
    }

    /**
     * @return - Передача введённого пользователем второго числа в метод "calculate".
     */
    public double getSecondNumber() {
        System.out.print("Введите второе число: ");
        if (input.hasNextDouble()) {
            return input.nextDouble();
        } else {
            myLogger.warning("Ввели не число");
            myLogger.info("---".repeat(15));
            throw new IllegalArgumentException("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
    }
}
