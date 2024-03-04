package JAN_05_01_24;

class Parent {

    String name;

    Parent(){
        System.out.println("Hello");
    }
    void details(){
        System.out.println(name.toUpperCase());
    }

}

public class Child extends Parent {
String name;

public void details() {
    super.name = "Parent";
    name = "Child";
    System.out.println(super.name + " and " + name);
    super.details();
}

public static void main(String[] args) {
    Child cobj = new Child();
    cobj.details();
}
}
