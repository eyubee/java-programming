package day63_collections;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<>();
          set.add(500);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        System.out.println(set);
        Set<String> words= new HashSet<>();
        words.add("side") ;
        words.add("hello");
        words.add("from") ;
        words.add("the")  ;
        words.add("other") ;
        words.add("side") ;
        System.out.println(words);
        for(String string: words)   {
            
        }
        //to convert set to a list
        List<String> wordsList= new ArrayList<>(words);
        System.out.println(wordsList);

        Set <String > linkedHashSet= new LinkedHashSet<>();
        linkedHashSet.add("12") ;
        linkedHashSet.add("java");
        linkedHashSet.add("java");
        linkedHashSet.add("53");
        linkedHashSet.add("$");
        System.out.println(linkedHashSet);


        Set <String > treeSet= new TreeSet<>();
        treeSet.add("12") ;
        treeSet.add("java");
        treeSet.add("java");
        treeSet.add("53");
        treeSet.add("$");
        System.out.println(treeSet);
       // ((TreeSet)treeSet).first();  down casting to get additional searching method
    }
}
