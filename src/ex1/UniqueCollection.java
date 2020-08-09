package ex1;
import java.util.*;
public class UniqueCollection {
    public static void main(String[] args) {
        List<Integer> example = new ArrayList<>();
        example.add(4);
        example.add(4);
        example.add(4);
        example.add(4);
        example.add(4);
        example.add(4);
        example.add(4);
        System.out.println(example);
        System.out.println(uniqCol(example));

    }
    public static <E>Collection<E> uniqCol(Collection<E> col){
        return new HashSet<>(col);
    }
}
