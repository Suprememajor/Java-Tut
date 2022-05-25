package linkedlistvsarraylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("John");
        namesLinkedList.add("Paul");
        namesLinkedList.add("George");
        namesLinkedList.add("Ringo");
        System.out.println(namesLinkedList.get(2));
        //linear time search
        namesLinkedList.add(1, "Jerry");
        //faster insert(adding) due and removing to only changing prev and next pointers

        ArrayList<String> namesArrayList = new ArrayList<>();
        //Uses an array under the hood
        namesArrayList.add("John");
        namesArrayList.add("Paul");
        namesArrayList.add("George");
        namesArrayList.add("Ringo");
        System.out.println(namesArrayList.get(2));
        //faster here that in linkedlist due to random access in arrays that is "constant time"
        namesLinkedList.add(1, "Jerry");
        //Has to move all the elements, not favorable for inserting and deleting
    }
}
