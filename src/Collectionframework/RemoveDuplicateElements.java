package Collectionframework;
import java.util.*;

public class RemoveDuplicateElements {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>[];

        list.add(5);
        list.add(10);
        list.add(15);
        list.add(5);
        list.add(20);
        Set<Integer> set = new LinkedHashSet<>(list);
        ArrayList<Integer> List = new ArrayList<>(set);
        System.out.println(" Removing Duplicate: " + List );

    }
}
