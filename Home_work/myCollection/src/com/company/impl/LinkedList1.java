package com.company.impl;

import com.company.IList;

import java.util.Arrays;

public class LinkedList1 implements IList {
    Node root = null;

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }


    @Override
    public void clear() {
        if (root == null) {
            return;
        }
        clear(root.next);
        root = null;
    }

    private void clear(Node element) {
        if (element == null) {
            return;
        }
        clear(element.next);
        element.next = null;
    }

    @Override
    public int size() {
        return size(root, 0);
    }

    private int size(Node element, int size) {
        if (element == null) {
            return size;
        }
        return size(element.next, size + 1);
    }

    @Override
    public int get(int index) {
        isIndexSuitable(index);
        return getNodeByIndex(index, 0, root).value;
    }

    private Node getNodeByIndex(int index, int currentIndex, Node element) {
        if (element == null) {
            throw new IllegalArgumentException("NO_NUMBER_IN_COLLECTION");
        } else if (index == currentIndex) {
            return element;
        }
        return getNodeByIndex(index, currentIndex + 1, element.next);
    }

    @Override
    public boolean add(int value) {
        if (root == null) {
            root = new Node(value);
            return true;
        } else {
            add(value, root);
        }
        return true;
    }

    private void add(int value, Node element) {
        if (element.next == null) {
            element.next = new Node(value);
            return;
        }
        add(value, element.next);
    }

    @Override
    public boolean add(int index, int value) {
        if (root == null && index == 0) {
            root = new Node(value);
            return true;
        }
        if (root == null || index < 0) {
            return false;
        }
        if (index == 0) {
            Node newElement = new Node(value);
            Node saveElement = new Node(root.value);
            root = newElement;
            root.next = saveElement;
            return true;
        }
        Node previousElement = getNodeByIndex(index - 1, 0, root);
        Node newElement = new Node(value);
        newElement.next = previousElement.next;
        previousElement.next = newElement;
        return true;
    }

    @Override
    public int remove(int number) {
        if (root == null) {
            throw new IllegalArgumentException("EMPTY_COLLECTION_EXCEPTION");
        }
        if (root.value == number) {
            root = root.next;
            return number;
        }
        Node previousElement = getPreviousNodeByValue(number, root);
        previousElement.next = previousElement.next.next;
        return number;
    }

    @Override
    public int removeByIndex(int index) {
        isIndexSuitable(index);
        Node ourElement = getNodeByIndex(index, 0, root);
        int value = ourElement.value;
        remove(value);
        return value;
    }

    @Override
    public boolean contains(int value) {
        return contains(value, root) != 0;
    }

    private int contains(int value, Node element) {
        if (element == null) {
            return 0;
        }
        if (element.value == value) {
            return 1;
        }
        return contains(value, element.next);
    }

    @Override
    public boolean set(int index, int value) {
        try {
            Node ourNode = getNodeByIndex(index, 0, root);
            ourNode.value = value;
            return true;
        } catch (IllegalArgumentException exception) {
            return false;
        }
    }


    @Override
    public void print() {
        if (size() == 0) {
            System.out.println("EMPTY_ARRAY");
            return;
        }
        System.out.println(toString());
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        int[] array = toArray();
        for (int value : array) {
            if (value == array[array.length - 1]) {
                result.append(value);
                break;
            }
            result.append(value).append("");
        }
        result.append("]");
        return result.toString();
    }

    @Override
    public int[] toArray() {
        if (root == null) {
            return new int[]{};
        }
        int[] array = new int[size()];
        return toArray(root, 0, array);
    }

    private int[] toArray(Node element, int currentIndex, int[] array) {
        if (element.next == null) {
            array[currentIndex] = element.value;
            return array;
        }
        array[currentIndex] = element.value;
        return toArray(element.next, currentIndex + 1, array);
    }

    @Override
    public boolean removeAll(int[] array) {
        if (array == null || Arrays.equals(array, new int[]{})) {
            return true;
        }
        if (Arrays.equals(array, toArray())) {
            clear();
            return true;
        }
        boolean flag = false;
        for (int value : array) {
            if (contains(value)) {
                remove(value);
                flag = true;
            }
        }
        return flag;
    }

    private Node getPreviousNodeByValue(int value, Node element) {
        if (element.next == null) {
            throw new IllegalArgumentException("NO_NUMBER_IN_COLLECTION");
        }
        if (element.next.value == value) {
            return element;
        }
        return getPreviousNodeByValue(value, element.next);
    }

    private void isIndexSuitable(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("INDEX_EXCEPTION");
        }
    }
}