package com.company.impl;

import com.company.IList;
import com.company.utils.Constans;

public class LList implements IList {


    class Node {
        Node next;
        int value;

        public Node(int value) {
            this.next = null;
            this.value = value;

        }


    }

    private Node head = null;

    @Override
    public void clear() {


    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int get(int index) {
        return 0;

    }

    @Override
    public boolean add(int value) {
        if (head == null) {
            head = new Node(value);
        }
        else {
          add(head,value);
        }
        return true;

    }

    private void add(Node node,int value) {
        if (node.next == null) {
            node.next = new Node(value);
            return;
        }
        add(node.next,value);
    }


    @Override
    public boolean add(int index, int value) {

        return false;
    }


    @Override
    public int  remove(int number) {
return 0;
    }

    @Override
    public int removeByIndex(int index) {
        return 0;
    }

    @Override
    public boolean contains(int value) {

        return false;
    }

    @Override
    public boolean set(int index, int value) {

        return false;
    }

    @Override
    public void print() {
        System.out.println(createStringForPrint(head));

    }

    private String createStringForPrint(Node node) {
        Node forPrint = node;
        if (head.next == null) {
            return "Is Empty";
        }
        StringBuilder myString = new StringBuilder();
        myString.append("[ ");
        if (forPrint.next != null) {
            myString.append(forPrint.value + ", ");
            forPrint = node.next;
        }

        return myString.append(" ]").toString();
    }

    @Override
    public int[] toArray() {

        return null;
    }

    @Override
    public boolean removeAll(int[] ar) {

        return false;
    }


}
