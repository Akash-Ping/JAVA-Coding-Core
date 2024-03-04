package JAN_20_01_24;

class MyThread3 extends Thread
{
    Thread t5;
    MyThread3(Thread t2)
    {
        this.t5=t2;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

            try {
                t5.join();  //executed by MyThread3
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            System.out.println("MyThread3 Thread Starting...");
        }
    }
}

class DemoThread2 extends Thread
{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread Starting...");
            try {
                Thread.sleep(5000);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
public class JoinDemo {
    public static void main(String[] args) throws InterruptedException{
        DemoThread2 t9=new DemoThread2();
        MyThread3 t2=new MyThread3(t9);
        t9.start();
        t2.start();
        t2.join(); ///exceuted by main  thread
        //t2.interrupt();
        for (int i = 0; i <5 ; i++) {
            System.out.println("Main Thread");
        }
    }
}