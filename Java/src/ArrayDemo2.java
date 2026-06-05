import java.util.*;
public class ArrayDemo2 {
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(124);
        arr.add(234);
        arr.add(68);
        arr.add(12);
        arr.add(57);
        arr.add(432);
        arr.add(78);
        arr.add(435);
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
        arr.remove(Integer.valueOf(234));
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        Integer[] i = new Integer[arr.size()];
        i=arr.toArray(i);
        for(Integer j:i){
            System.out.println(j);
        }

    }
}
