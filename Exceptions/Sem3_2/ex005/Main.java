/*
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то
элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и
MyArrayDataException и вывести результат расчета (сумму элементов, при условии, что подали на вход
корректный массив).
*/

package Sem3_2.ex005;

public class Main {
    public static void main(String[] args) {
        String[][] matrix = {{"1","2","3","4"},
                             {"1","2","3","4"},
                             {"1","2","3","4"},
                             {"1","2","3","4"}};
        System.out.println(sumMatrix(matrix));
    }
    public static int sumMatrix(String[][] matrix) {
        if (matrix.length != 4 || matrix[1].length != 4) {
            throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[1].length; j++) {
                try {
                    sum += Integer.parseInt(matrix[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException();
                }
            }
        }
        return sum;
    }
}
class MyArraySizeException extends RuntimeException {
    private String sizeMessage = "Неверный размер массива";
    public MyArraySizeException() {
    }
    @Override
    public String getMessage() {
        return sizeMessage;
    }
}
class MyArrayDataException extends RuntimeException {
    private String dateMessage = "Элемент не является целым числом";
    public MyArrayDataException() {
    }
    @Override
    public String getMessage() {
        return dateMessage;
    }
}