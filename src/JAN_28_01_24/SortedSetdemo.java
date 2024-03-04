package JAN_28_01_24;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

//class Student implements Comparable{

class Student{
    String name;
    Integer id;

    public Student(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    //-1
    //+
    //0
//    @Override
//    public int compareTo(Object o) {
//        Student student = (Student) o;
//        Integer id = student.getId();
////        return Integer.compare(this.id, id);
//
//        if(this.id>id)
//        {
//            return 1;
//        } else if (this.id<id) {
//            return -1;
//        }
//        else{
//            return 0;
//    }
//
//    }
}

class Mycomp implements Comparator
{

    @Override
    public int compare(Object o1, Object o2) {
        Student s1=(Student) o1;   // Typecasting
        Student s2=(Student) o2;
        Integer id1=((Student) o1).getId();
        Integer id2=((Student) o2).getId();
        if(id1>id2)
        {
            return 1;
        } else if (id1<id2) {
            return -1;
        }
        else
            return 0;

    }
}


public class SortedSetdemo {
    public static void main (String[] args) {
        SortedSet<Student> sortedSet=new TreeSet<>(new Mycomp());

        /*sortedSet.add(10);
        sortedSet.add(2);
        sortedSet.add(80);
        sortedSet.add(1);*/
        //9,10,20,30,


        sortedSet.add(new Student("raj",8));
        sortedSet.add(new Student("Arun",1));
        sortedSet.add(new Student("Simran",67));
        sortedSet.add(new Student("divyanshu",3));
        System.out.println(sortedSet);
    }


}
