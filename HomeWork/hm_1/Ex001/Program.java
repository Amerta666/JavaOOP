package hm_1.Ex001;

public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 4);
        Owner owner1 = new Owner("Николай");

        cat1.setNameOwner(owner1.getName());
        cat1.Greet();
    }
}
