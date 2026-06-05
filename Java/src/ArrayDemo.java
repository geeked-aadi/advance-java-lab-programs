import java.util.*;
public class ArrayDemo {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Monday");
        arr.add("Monday");
        arr.add("Tuesday");
        arr.add("Wednesday");
        arr.add("Thursday");
        arr.add("Friday");
        arr.add("Saturday");
        arr.add("Sunday");
        arr.add("Sunday");
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
        arr.remove("Sunday");
        Collections.sort(arr);
        System.out.println(arr);
        String[] s = new String[arr.size()];
        s=arr.toArray(s);
        for(String st :arr){
            System.out.println(st);
        }




    }
}
