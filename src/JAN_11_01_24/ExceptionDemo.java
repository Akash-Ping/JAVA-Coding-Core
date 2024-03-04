package JAN_11_01_24;

public class ExceptionDemo {
    public static void main(String[] args) {

        System.out.println("Main Method");

        try {
            System.out.println("inside try");
            throw new ArithmeticException("Main Reason nhi dunga krna ha jo kr le");
//            System.out.println(10 / 0);
//
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("Main hu Done");
        }
    }
}
