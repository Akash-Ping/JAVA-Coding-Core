package JAN_11_01_24;

public class ExceptionDemo2 {
    public static void main(String[] args) {

        System.out.println(print());
    }

    public static int print()
    {

        try {
            System.exit(0);
            System.out.println(10/0);

            return 100;
        }
        catch (ArithmeticException e)
        {
            return 778;
        }
        finally {
            return 222;
        }
    }
}
