package hm5;

import java.util.Scanner;

public class CalcView {
    Scanner in = new Scanner(System.in);

    public void showOutput(double value) {

        System.out.println("Результат: " + value);
    }


    public char selectOperation() {
        System.out.println("Введите операцию(+, -, *, /): ");
        return in.next().charAt(0);
    }

    public double getFirstNumber() {
        System.out.print("Введите первое число: ");
        if (in.hasNextDouble()) {
            return in.nextDouble();
        } else {
            throw new IllegalArgumentException("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
    }

    public double getSecondNumber() {
        System.out.print("Введите второе число: ");
        if (in.hasNextDouble()) {
            return in.nextDouble();
        } else {
            throw new IllegalArgumentException("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
    }
}
