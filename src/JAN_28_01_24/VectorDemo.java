package JAN_28_01_24;

import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
       /* Vector<Integer> vector=new Vector<>();
        System.out.println(vector.capacity()); //cc
        for (int i = 0; i <10 ; i++) {
            vector.addElement(i);
//            vector.add(i);
        }
        System.out.println(vector.capacity());//
        vector.addElement(90);
        System.out.println(vector.capacity());
//        System.out.println(vector);
        //vector
        Enumeration<Integer> elements = vector.elements();
        while (elements.hasMoreElements())
        {
            Integer integer = elements.nextElement();
            System.out.println(integer);
        }
*/
//
//        ArrayList<Integer> list=new ArrayList<>();
//        list.add(10);
//        list.add(250);
//        list.add(30);
//        list.add(40);
//        System.out.println("Sorted lis ="+list);
//        Collections.sort(list);
//        System.out.println("Sorted lis ="+list);
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//        }

//        ListIterator<Integer> listIterator = list.listIterator();
//        while (listIterator.hasNext())
//        {
//            System.out.println(listIterator.next());
//        }
//        System.out.println(listIterator.previous());

//        Stack<Integer>	stk	=	new	Stack<>();
//        stk.push(10);
//        stk.push(20);
//        stk.push(30);
//        stk.push(40);
//        System.out.println("Stack is :" + stk);
//        System.out.println("Pop	:	"	+	stk.pop());
//        System.out.println("Pop	:	"	+	stk.pop());
//        System.out.println("Stack is : " + stk);
//        stk.push(50);
//        stk.push(60);
//        System.out.println("Stack is :" + stk);
//        System.out.println("Peek	:	"	+	stk.peek());
//        System.out.println("Peek	:	"	+	stk.peek());
//        System.out.println("Stack is : " + stk);

        Set<Integer>	set	=	new	LinkedHashSet<Integer>();
        set.add(50);
        set.add(40);
        set.add(308);
        set.add(20);
        set.add(10);
        System.out.println("Set :" + set);
    }

}
