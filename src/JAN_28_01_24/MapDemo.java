package JAN_28_01_24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer, String> mapdemo = new HashMap<>();

        mapdemo.put(10, "Akash");
        mapdemo.put(11, "Simran");
        mapdemo.put(30,"New Gf");
        mapdemo.put(12, "Rishab");
        mapdemo.put(13, "Alisha");
        System.out.println(mapdemo);
        mapdemo.put(null,"null value"); // only one time
        mapdemo.put(11,"New Gf");

        System.out.println(mapdemo); //order no


        Iterator<Map.Entry<Integer, String>> iterator = mapdemo.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Iterator<Integer> iterator1 = mapdemo.keySet().iterator();
        while (iterator1.hasNext())
        {
            Integer key =iterator1.next();
            System.out.println("key ="+key);
            System.out.println("value = "+mapdemo.get(key));
            System.out.println(iterator1.next());
        }

        mapdemo.keySet().stream().forEach(System.out::println); //java 8
    }
}