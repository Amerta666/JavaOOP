/*
1. Создайте класс исключения, который будет выбрасываться при делении на 0.
Исключение должно отображать понятное для пользователя сообщение
об ошибке.
2. Создайте класс исключений, которое будет возникать при обращении к
пустому элементу в массиве ссылочного типа. Исключение должно
отображать понятное для пользователя сообщение об ошибке
3. Создайте класс исключения, которое будет возникать при попытке открыть
несуществующий файл. Исключение должно отображать понятное для
пользователя сообщение об ошибке.
 */

package Sem3_2.ex004;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            divisionTwoIntZero(10, 0);
        } catch (DivisionByZero e) {
            System.out.println(e.getMessage());
        }
        try {
            String[] stringArray = new String[7];
            nullArray(stringArray);
        } catch (ArrayNullPointer e) {
            System.out.println(e.getMessage());
        }
        try {
            fileNotFound(new File("5.txt"));
        } catch (FileNotFound e) {
            System.out.println(e.getMessage());
        }

    }
    public static int divisionTwoIntZero(int a, int b) {
        if (b == 0) {
            throw new DivisionByZero();
        }
        return a / b;
    }
    public static String[] nullArray(String[] array) {
        for (String el: array) {
            if (el == null) {
                throw new ArrayNullPointer();
            }
        }
        return array;
    }
    public static boolean fileNotFound(File file) throws FileNotFound {
        if (file.exists()) {
            return true;
        }
        throw new FileNotFound();
    }


}

class DivisionByZero extends ArithmeticException {
    public DivisionByZero() {
        super();
        this.detailedMessage = detailedMessage;
    }
    private String detailedMessage = "Деление на ноль";
    public String getMessage() {
        return detailedMessage;
    }
}

class ArrayNullPointer extends NullPointerException {
    private String detailedMessage = "Элемент массива является null";
    @Override
    public String getMessage() {
        return detailedMessage;
    }
    public ArrayNullPointer() {
        super();
        this.detailedMessage = detailedMessage;
    }
}

class FileNotFound extends FileNotFoundException {
    private String detailedMessage = "Файл не найден";
    @Override
    public String getMessage() {
        return detailedMessage;
    }
    public FileNotFound() {
        super();
        this.detailedMessage = detailedMessage;
    }
}
