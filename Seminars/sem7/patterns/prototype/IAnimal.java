package sem7.patterns.prototype;

public interface IAnimal extends Cloneable {
        IAnimal clone();
        void makeSound();
}
