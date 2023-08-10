package sem7.patterns.simpleExample;

public class Person {
    private String name;
    private int age;
    private Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    // Создаем глубокую копию объекта Person
    public Person copy() {
        Address copiedAddress = this.address.copy();
        return new Person(this.name, this.age, copiedAddress);
    }
}
