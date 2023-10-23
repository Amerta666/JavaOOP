/*
Создать метод принимающий делимое и делитель, возвращает их отношение.
Корректно отработать случай когда делитель равен нулю
*/
package Sem1_2.ex001;

public class Main {
    public static Integer divide(int a, int b) {
        if (b != 0) return a / b;
        return null;
    }

    public static void main(String[] args) {
        System.out.println(divide(2, 0));
    }
}