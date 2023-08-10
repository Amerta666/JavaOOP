package hm7;

import java.util.Scanner;
import java.util.logging.Logger;

public class CalcPresenter {

    private CalcModel model;
    private CalcView view;

    private static MyLogger myLogger = new MyLogger("HomeWork/hm7/log.txt");

    /**
     * @param model - данные для отображения
     * @param view  - реализация отображения данных
     */
    public CalcPresenter(CalcModel model, CalcView view) {
        this.model = model;
        this.view = view;
    }

    public void calculate() {
        view.greetings();
        String quit = "";
        while (quit == "") {
            double firstNumber = view.getFirstNumber();
            myLogger.info("Первое число - " + firstNumber);
            double secondNumber = view.getSecondNumber();
            myLogger.info("Второе число - " + secondNumber);
            char ch = view.selectOperation();
            myLogger.info("Операция - " + ch);
            double result = 0;
            switch (ch) {
                case '+' -> result = model.sum(firstNumber, secondNumber);
                case '-' -> result = model.sub(firstNumber, secondNumber);
                case '*' -> result = model.mul(firstNumber, secondNumber);
                case '/' -> result = model.div(firstNumber, secondNumber);
                default -> {
                    System.out.println("Введена неверная операция");
                    myLogger.warning("Введена неверная операция");
                }
            }
            view.showOutput(result);
            myLogger.info("Результат операции - " + result);
            myLogger.info("---".repeat(15));
            System.out.println("Нажмите Enter для продолжения или введите любой символ для выхода");
            Scanner iScanner = new Scanner(System.in);
            quit = iScanner.nextLine();
        }
    }
}