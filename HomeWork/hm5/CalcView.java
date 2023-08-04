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
        return in.nextDouble();
    }


    public double getSecondNumber() {
        System.out.print("Введите второе число: ");
        return in.nextDouble();
    }
}
