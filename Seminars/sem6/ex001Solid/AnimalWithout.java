package sem6.ex001Solid;

class AnimalWithout {
    String name;

    AnimalWithout(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " ест.");
    }

    void sleep() {
        System.out.println(name + " спит.");
    }

    void makeSound() {
        System.out.println(name + " издает звук.");
    }
}

