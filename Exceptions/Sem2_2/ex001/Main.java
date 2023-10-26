package Sem2_2.ex001;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] arr = new int[10];
            System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
            int index = scanner.nextInt();
            arr[index] = 1;
            System.out.println(Arrays.toString(arr));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Указан индекс за пределами массива.");
        } catch (InputMismatchException e) {
            System.out.println("Введите число");
        }
    }
}