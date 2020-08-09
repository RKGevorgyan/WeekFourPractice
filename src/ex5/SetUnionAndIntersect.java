package ex5;
import java.util.*;

public class SetUnionAndIntersect {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            set1.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int i = 5; i <= 10; i++) {
            set2.add(i);
        }

        //System.out.println(union(set1,set2));
        System.out.println(intersect(set1,set2));

    }
    static <E> Set<E> union(Set<E> set1,Set<E> set2){
        set1.addAll(set2);
        return set1;
    }
    static <E> Set<E> intersect(Set<E> set1,Set<E> set2){
        set1.retainAll(set2);
        return set1;
    }

}
