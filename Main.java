abstract class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
    public abstract void makeSound();
}
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Gau gau");
    }
}
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Meo meo");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("gau "),
                new Cat("Kitty")
        };
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}