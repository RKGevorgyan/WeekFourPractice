package ex6;
import java.util.*;

public class ProductDemo {
    public static void main(String[] args) {
        Product toy1 = new Product("doll");
        Product toy2 = new Product("doll");
        Product toy3 = new Product("car");

        Map<String,Product> map = new HashMap<>();

        map.put("Barby",toy1);
        map.put("Kent",toy2);
        map.put("BMW",toy3);

        for(Map.Entry<String,Product> elem : map.entrySet()){
            System.out.printf("Key: %s, Value: %s\n",elem.getKey(),elem.getValue());
        }

        printKeyAndValue(map);
        printKey(map);
        printValue(map);

    }
    static <K,V> void printKeyAndValue(Map<K,V> map){
        System.out.println("Key and Value:");
        System.out.println(map.entrySet());
    }
    static <K,V> void printKey(Map<K,V> map) {
        Set<K> set = map.keySet();
        System.out.println("Keys: "+ set);
    }
    static <K,V> void printValue(Map<K,V> map){
        Collection<V> collection = map.values();
        System.out.println("Values: "+collection);
    }
}
