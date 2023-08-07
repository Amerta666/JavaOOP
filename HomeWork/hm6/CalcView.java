package hm6;

import java.util.Scanner;

public class CalcView {

    // Создаём сканер для считывания введённых данных с клавиатуры
    Scanner in = new Scanner(System.in);

    /**
     *
     * @param value - результат вычисления
     */
    // Метод получения результата вычисления и вывод в терминал
    public void showOutput(double value) {
        System.out.println("Результат: " + value);
    }


    /**
     *
     * @return - передача введённого символа в метод "calculate"
     */
    //Метод получения введённого символа с клавиатуры и передачи его в "calculate".
    public char selectOperation() {
        System.out.println("Введите операцию(+, -, *, /): ");
        return in.next().charAt(0);
    }

    /**
     *
     * @return - Передача введённого пользователем первого числа в метод "calculate".
     */
    // Метод получения, проверки и передачи введённого пользователем первого числа.
    public double getFirstNumber() {
        System.out.print("Введите первое число: ");
        if (in.hasNextDouble()) {
            return in.nextDouble();
        } else {
            // Вывод сообщения об ошибке при некорректном вводе
            throw new IllegalArgumentException("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
    }

    /**
     *
     * @return - Передача введённого пользователем второго числа в метод "calculate".
     */
    // Метод получения, проверки и передачи введённого пользователем второго числа.
    public double getSecondNumber() {
        System.out.print("Введите второе число: ");
        if (in.hasNextDouble()) {
            return in.nextDouble();
        } else {
            // Вывод сообщения об ошибке при некорректном вводе
            throw new IllegalArgumentException("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }
    }
}
