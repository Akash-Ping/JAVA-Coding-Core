package DEC_23_12_23;

public class Stringdemo {
    public static void main(String[] args) {

        String s1 = "AKAsh";
        System.out.println(s1);
        String s2 = "Ping";
        System.out.println(s2);

       String s3 = "AKAsh";
       String s4 = new String("AKAs fdh");
       String s5 = new String("AKAsh");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s4==s5);
        System.out.println(s4.equals(s5));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s5.hashCode());

        int len  = s4.length();
        System.out.println(len);


    }
}
