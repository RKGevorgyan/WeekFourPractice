package ex4;
import java.util.*;

public class MapFromArray {
    public static void main(String[] args) {
        Integer[] integers = {1,2,2,4,4,4,4,5};
        Map<Integer,Integer> map = arrayToMap(integers);
        System.out.println(map);
        Map<Integer,Integer> map2 = arrayToMapCompute(integers);
        System.out.println(map2);

    }
    // using method compute()
    public static <K> Map<K, Integer> arrayToMapCompute(K[] ks) {
        Map<K, Integer> map = new HashMap<>();
        for (K k : ks) {
            map.compute(k,(key,value)->value==null ? 1 : value+1);
        }

        return map;
    }
    // without compute()
    public static <K> Map<K, Integer> arrayToMap(K[] ks){
        Map<K,Integer> map = new HashMap<>();
        for(K k : ks){
            Integer count = map.get(k);
            map.put(k,count==null ? 1 : count+1);
        }
        return map;
    }
}
