package DEC_23_12_23;

public class ChartoString {
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd', 'e'};
//        for (char c : arr) {
//            System.out.println(c);

        String str = new String(arr);
//        System.out.print(str);

        String s12="hello";
        String s13="hella";
        int res = s12.compareTo(s13);
        System.out.println(res);

        System.out.println(s12.equals(s13));

        String s15="hello ashwani welcome to the development batch spark 1.0";
        System.out.println(s15.contains("ashwani"));
        System.out.println(s15.contains("Deep"));

        //indexOf()
        System.out.println(s15.indexOf('a'));
        //replace()\
        String ss="hello world";
        String res1=ss.replace("hello","ashwani");
        System.out.println(res1);


    }
    }

