package JAN_21_01_24;


class MyPrivateDemo{
    private class A{

    }
    private int privateVariable=10;
    private void privateDemoMethod()
    {
        System.out.println("Main hu private");

    }
}
public class PrivateDemo {

    public static void main(String[] args){
        MyPrivateDemo myPrivateDemo = new MyPrivateDemo();
//        myPrivateDemo.privateVariable;
    }

}
