package JAN_05_01_24;

class A {
    String city;
    A(){
        System.out.println("Hello");
    }
}

class B extends A{
    String city;

    void print(){
        super.city = "Agra";
        city = "Delhi";
        System.out.println("Parent City = "+ super.city+ ","+ "Child City = "+this.city);
    }
}

public class Test4{
    public static void main(String[] args) {
        B b = new B();
        b.print();
    }
}
