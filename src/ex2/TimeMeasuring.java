package ex2;
import java.util.*;

public class TimeMeasuring {
    static final int ADD=1_000_000;
    static final int GET=1000;
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        List<Double> link = new LinkedList<>();

        for (int i=0;i<ADD;i++){
            list.add(Math.random());
            link.add(Math.random());
        }

        long currentTime = System.currentTimeMillis();
        getElement(list);
        System.out.println(System.currentTimeMillis()-currentTime);

        currentTime = System.currentTimeMillis();
        getElement(link);
        System.out.println(System.currentTimeMillis()-currentTime);

    }
    static void getElement(List<? extends Number> col){
        for (int i=0;i<GET;i++){
            col.get((int)(Math.random()*(ADD-1)));
        }
    }

}
