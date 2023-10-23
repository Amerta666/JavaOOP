/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен сумме элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.
*/

package Sem1_2.ex003;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] secondArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(sumArrays(firstArray, secondArray)));
    }

    public static int[] sumArrays(int[]a, int[]b) {
        int max;
        if (a.length < b.length) {
            max = b.length;
        }
        else max = a.length;
        int[] sum =  new int[max];
        try {
            for (int i = 0; i < max; i++) {
                sum[i] = a[i] + b[i];
            }
            return sum;

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Разный размер массивов");
            return null;
        }
    }
}
