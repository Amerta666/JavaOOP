/*
Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
Метод должен пройтись по каждому элементу и проверить что он не равен null. А теперь реализуйте следующую логику:
1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
 */

package Sem1.ex003;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, null, 5, 6, 7, 8, null, 0};
        System.out.println("Элементы равные NULL находятся в списке под индексами: " + checkArray(array));
    }

    public static ArrayList<Integer> checkArray(Integer[] arr) {
        ArrayList<Integer> nullList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                nullList.add(i);
                System.out.println("Элемент с индексом " + i + " равен NULL");
            }
        }
        return nullList;
    }
}
