/*
Создайте метод doSomething(), который может быть источником одного из
типов checked exceptions (тело самого метода прописывать не обязательно).
Вызовите этот метод из main и обработайте в нем исключение, которое
вызывает метод doSomething().
*/
package Sem3_2.ex002;

public class Main {
    public static void main(String[] args){
        try {
            System.out.println(doSomething(12, 6));
        } catch (Exception e) {
            System.out.println("Деление на ноль невозможно");
        }
    }

    public static int doSomething (int a, int b) throws Exception {
        return a / b;
    }
}
