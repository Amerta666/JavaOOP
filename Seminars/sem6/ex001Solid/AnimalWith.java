package sem6.ex001Solid;

class AnimalWith {
    String name;

    AnimalWith(String name) {
        this.name = name;
    }
}

class AnimalFeeding {
    void eat(AnimalWith animalWith) {
        System.out.println(animalWith.name + " ест.");
    }
}

class AnimalSleeping {
    void sleep(AnimalWith animalWith) {
        System.out.println(animalWith.name + " спит.");
    }
}

class AnimalSounds {
    void makeSound(AnimalWith animalWith) {
        System.out.println(animalWith.name + " издает звук.");
    }
}
