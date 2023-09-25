/*Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
3. если вместо массива пришел null, метод вернет -3
4. придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
 */

package Sem1.ex002;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        //int[] array = null;
        int arrLenghtMin = 6;
        int value = 6;
        System.out.println(checkNumber(array, value, arrLenghtMin));
    }

    public static int checkNumber(int[] arr, int value, int arrLenghtMin) {
        if (arr != null) {
            if (arr.length > arrLenghtMin) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == value) {
                        return i;
                    }
                }
                return -2;
            }
            return -1;
        }
        return -3;
    }
}
