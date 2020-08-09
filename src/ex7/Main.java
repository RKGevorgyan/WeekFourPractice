package ex7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new LinkedList<Student>();
        list.add(new Student("Bob",1234,1,4,3,2));
        list.add(new Student("Michel",2334,2,3,2,3));
        list.add(new Student("Rose",2334,2,5,5,3));
        list.add(new Student("Jone",2734,2,4,4,2));
        Student.filterStudents(list);
        Student.printStudents(list,3);

    }
}
