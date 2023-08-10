package sem7.patterns.prototype;

public class Main {
    public static void main(String[] args) {
        IAnimal cat = new Cat();
        IAnimal dog = new Dog();

        IAnimal clonedCat = cat.clone();
        IAnimal clonedDog = dog.clone();

        cat.makeSound(); // Выведет: Meow!
        dog.makeSound(); // Выведет: Woof!
        clonedCat.makeSound(); // Выведет: Meow!
        clonedDog.makeSound(); // Выведет: Woof!
    }
}
