package DEC_30_12_23;

class Animal2 {
    Animal2 reproduce() {
        System.out.println("Animal reproducing");
        return new Animal2();
    }
}

class Dog extends Animal2 {
    @Override
    Dog reproduce() {
        System.out.println("Dog reproducing");
        return new Dog();
    }

    void bark() {
        System.out.println("Woof!");
    }
}

public class CovariantReturnTypeExample {
    public static void main(String[] args) {
        Animal2 animal = new Dog();
        Animal2 newAnimal = animal.reproduce();  // Calls the overridden method in Dog class
    }
}
