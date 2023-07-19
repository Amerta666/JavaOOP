package hm_1.Ex001;

public class Cat {
    private String name;
    private int age;
    private String nameOwner;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public void Greet() {
        System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет). Мой владелец - " + nameOwner + ".");
    }
}