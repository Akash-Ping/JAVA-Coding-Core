package JAN_05_01_24;

class Parent1 {
    Parent1() {
        System.out.println("Parent constructor");
    }
}

class Child1 extends Parent1 {
    int childVariable;

    Child1() {
        // Incorrect: super should be the first statement
        // SomeCode(); // This would be an error
        super(); // Correct: super is the first statement
        System.out.println("Child constructor");
        childVariable = 42;
    }
}