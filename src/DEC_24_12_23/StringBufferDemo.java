package DEC_24_12_23;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Akash");
        System.out.println(sb);
        sb.append("Ping");
        System.out.println(sb);
        sb.insert(6, "Kumar ");
        System.out.println(sb);
    }
}
