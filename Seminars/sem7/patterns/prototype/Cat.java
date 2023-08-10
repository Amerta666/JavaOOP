package sem7.patterns.prototype;

public class Cat implements IAnimal {
    @Override
    public IAnimal clone() {
        return new Cat();
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class Dog implements IAnimal {
    @Override
    public IAnimal clone() {
        return new Dog();
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}