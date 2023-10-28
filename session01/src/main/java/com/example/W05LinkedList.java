package com.example;


public class W05LinkedList {
    public static class LinkedList<T> {
        Node head;
        private Node tail;
        private int size;

        class Node {
            T data;
            Node next;

            Node(T data) {
                this.data = data;
            }
        }

        public boolean add(T data) {
            Node node = new Node(data);
            if (head == null) {
                head = node;
            }
            if (tail != null) {
                tail.next = node;
            }
            tail = node;
            size++;
            return true;
        }

        public boolean delete(T data) {
            for (Node prev = null, current = head; current != null; prev = current, current =
                    current.next) {
                if (current.data.equals(data)) {
                    if (prev == null) {
                        // we are deleting the head
                        head = current.next;
                    } else {
                        prev.next = current.next;
                    }
                    if (current.next == null) {
                        // we are deleting the tail
                        tail = prev;
                    }
                    size--;
                    return true;
                }
            }
            return false;
        }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void display() {
            for (Node current = head; current != null; current = current.next) {
                System.out.println(current.data);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assert list.size() == 3;
        list.display();


        list.delete(2);
        assert list.size() == 2;
        list.display();


        list.delete(1);
        assert list.size() == 1;
        list.display();

        list.delete(3);
        list.display();
        assert list.isEmpty();
        System.out.println("All tests passed");
    }

}
