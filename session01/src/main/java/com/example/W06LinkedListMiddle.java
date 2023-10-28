package com.example;

import static com.example.W05LinkedList.LinkedList;

public class W06LinkedListMiddle {
    private W06LinkedListMiddle() {}

    public static <T> T middle(LinkedList<T>.Node head) {
        LinkedList<T>.Node byOne = head;
        LinkedList<T>.Node byTwo = head;
        // byTwo will reach the end of the list when byOne is at the middle
        while (byTwo != null && byTwo.next != null) {
            // byOne moves one node at a time
            byOne = byOne.next;
            // byTwo moves two nodes at a time
            byTwo = byTwo.next.next;
        }
        if (byOne == null) {
            // list is empty
            return null;
        }
        return byOne.data;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        assert middle(list.head) == null;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        assert middle(list.head) == 3;
        list.add(6);
        assert middle(list.head) == 4;
        System.out.println("All tests passed");
    }

}
