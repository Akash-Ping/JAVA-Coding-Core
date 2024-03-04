package JAN_07_01_24;



class Ansimal {
    String name;
}

class Dog extends Ansimal {
    String name;

    void print() {
        super.name = "Animal";
        name = "Jypsy";
        System.out.println("Parent name = " + super.name + " Child name = " + this.name);
    }
}

public class Msain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.print();
    }
}
