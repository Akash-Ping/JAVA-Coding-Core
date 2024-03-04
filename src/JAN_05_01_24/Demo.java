package JAN_05_01_24;

class Test
{
    Test() {

        System.out.println("Main test hu..........");
    }
}
public class Demo extends Test{

    int a;
    Demo()
    {
        this(10); /// calling parent class constructor
        System.out.println("Child..........");

    }

    public Demo(int i) {

        System.out.println("Arg........... ");
    }

    public static void main(String[] args) {
        Demo demo = new Demo();

    }
}