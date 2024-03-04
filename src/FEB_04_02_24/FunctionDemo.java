package FEB_04_02_24;

import java.util.function.Function;
import java.util.Collections;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String,Integer> f=(String s)->s.length();
        System.out.println(f.apply("Genie"));
//        Collections.sort();
    }
}
