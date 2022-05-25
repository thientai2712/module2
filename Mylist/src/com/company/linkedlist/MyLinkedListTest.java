package com.company.linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(1);
        list.add(1, 2);
        list.add(2,"Melinda");
        list.add(3,4);
        list.add(4,5);
        list.addFirst(0);
        list.addLast(9);
        list.printList();
        //System.out.println(list.indexOf("Melinda"));
        list.removeLast();
        list.printList();
    }
}
