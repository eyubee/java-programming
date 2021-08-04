package day62_collections;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> friends = new LinkedList<>();
        Collection<String> newFriends= new LinkedList<>();
        friends.add("bob");
        friends.add("james");
        newFriends.add("james");
        newFriends.add("bob");
        newFriends.add("bob");
        newFriends.add("eyu");
        /**allows  have duplicates and indexing
         * We get more option with linkedList*/
    }
}
