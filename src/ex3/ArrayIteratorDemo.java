package ex3;

public class ArrayIteratorDemo {
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5,6,7,8};
        ArrayIterator<Integer> iterator = new ArrayIterator<Integer>(array);
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

    }
}
