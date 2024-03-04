package FEB_03_02_24;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionQuestion {
    public static void main(String[] args) {

        int arr[]={10,20,40,10,30,50};
        //freq 10-->2 20-->1 40-->1 30-->1 50-->1

//        HashMap<Integer,Integer> map = new HashMap<>();
        //approach-1
        ConcurrentHashMap<Integer,Integer> map=new ConcurrentHashMap<>();
        map.put(10,10);
        map.put(60,20);
        map.put(50,30);
        map.put(40,40);
     /*   for (int val:arr) {
            if(map.containsKey(val))
            {
                map.put(val,map.get(val)+1);
            }
            else
            {
                map.put(val,1);
            }
        }*/
        System.out.println(map);
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
//            map.put(10,20); // main --- t1
            System.out.println(iterator.next());
            map.put(888,909); ///mainn ---t1
        }

    }
}
