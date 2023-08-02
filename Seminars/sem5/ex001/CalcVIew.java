package sem5.ex001;

import java.util.Scanner;

public class CalcVIew {
    Scanner in = new Scanner(System.in);

    public int userInput() {
        System.out.println("Введите число: ");
        return in.nextInt();
    }

    public void showOutput(int value) {
        System.out.println("Результат: " + value);
    }

    public char chooseOperation() {
        System.out.println("Введите операцию(+, -, *, /): ");
        return in.next().charAt(0);
    }


}
