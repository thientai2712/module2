package com.company.mylist;

import java.util.LinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList linkedList = new MyLinkedList(1);
//        linkedList.addFirst(11);
//        linkedList.addFirst(12);
//        linkedList.addFirst(13);
//
//        linkedList.add(4,9);
//        linkedList.add(5,16);

        linkedList.addLast(5);
        linkedList.addLast(6);
        linkedList.printList();
        linkedList.deleteByIndex(1);
        linkedList.printList();
    }
}
