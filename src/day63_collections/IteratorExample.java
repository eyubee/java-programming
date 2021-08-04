package day63_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("james");
        list.add("bob");
        list.add("jojo");
        System.out.println(list);
        Iterator<String> it= list.iterator();
        it.next();
        it.remove();
        System.out.println(list);

        Set<String > names= new HashSet<>();
        list.add("kevin");
        list.add("lalala");
        list.add("mj");
        Iterator<String> newNames= names.iterator();

        while(newNames.hasNext()){
            String currentName= newNames.next();
            System.out.println(currentName);
            if (currentName.length()<3){
                newNames.remove();
            }

        }


    }
}
