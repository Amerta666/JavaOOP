package sem3.ex004;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Класс животного
class Animal implements Comparable<Animal> {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // Реализация метода compareTo из интерфейса Comparable
    @Override
    public int compareTo(Animal other) {
        // Сравниваем животных по их возрасту
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + " years old)";
    }
}

public class AnimalComparatorExample {
    public static void main(String[] args) {
        // Создаём список животных
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Lion", 5));
        animals.add(new Animal("Elephant", 10));
        animals.add(new Animal("Giraffe", 7));

        // Сортируем животных с использованием интерфейса Comparable
        Collections.sort(animals);
        System.out.println("Сортировка и использованием Comparable (по возрасту):");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        // Создаём компаратор для сравнения животных по их именам
        Comparator<Animal> nameComparator = new Comparator<>() {
            @Override
            public int compare(Animal animal1, Animal animal2) {
                return animal1.getName().compareTo(animal2.getName());
            }
        };

        // Сортируем животных с использованием компаратора
        Collections.sort(animals, nameComparator);
        System.out.println("\nСортировка с использованием Comparator (по имени):");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
