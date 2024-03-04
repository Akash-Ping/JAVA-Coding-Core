package JAN_21_01_24;

class MyDefaultDemo
{
    int a=100;
    void print()
    {
        System.out.println("Genie Ashwani...");
    }
}
public class DefaultDemo {
    public static void main(String[] args) {
        MyDefaultDemo myDefaultDemo=new MyDefaultDemo();
        myDefaultDemo.a=100;
        System.out.println(myDefaultDemo.a);
        myDefaultDemo.print();
    }
}