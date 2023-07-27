package hm3.ex002;


import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = getRandomList();

        System.out.println("Начальный список:");
        System.out.println(list);

        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            int item = iterator.next();
            if (item > 50) {
                iterator.remove();
            }
        }

        System.out.println("Конечный список:");
        System.out.println(list);
    }

    public static LinkedList<Integer> getRandomList() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 15; i++) {
            list.add((int) Math.round(Math.random() * 100));
        }
        return list;
    }
}
