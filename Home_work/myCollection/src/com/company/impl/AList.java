package com.company.impl;

import com.company.IList;
import com.company.utils.Constans;

public class AList implements IList {
    private int[] array;
    private static final int DEFAUL_CAPACITY = 10;
    private int size = 0;

    public AList() {
        this.array = new int[DEFAUL_CAPACITY];

    }

    public AList(int[] array) {
        this.array = array;
        for (int i = 0; i < array.length; i++) {
            size++;
        }
    }

    public AList(int capacity) {
        if (capacity < 0) {
            System.out.println(Constans.INVALID_VALUE);
        }
        this.array = new int[capacity];
    }


    @Override
    public void clear() {
        array = new int[]{};
        size = 0;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int get(int index) {
        if (index >= size) {
            return array[index];
        }
        throw new IllegalArgumentException(Constans.INVALID_VALUE);
    }

    @Override
    public boolean add(int value) {
        if (array.length > size) {
            array[size++] = value;
            return true;
        } else {
            int[] afterCopy = new int[size * 2];
            for (int i = 0; i < size; i++) {
                afterCopy[i] = array[i];
            }
            afterCopy[size++] = value;
            array = afterCopy;

            return true;
        }
    }

    @Override
    public boolean add(int index, int value) {
        if (index > size) {
            System.out.println(Constans.INVALID_VALUE.concat(" Не смогли добавить на позицию " + index + " число " + value));
            return false;
        }
        int[] afterAdd = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                afterAdd[i] = value;
                i++;
            } else {
                afterAdd[i] = array[i];
            }

        }
        array = afterAdd;
        size++;
        return true;
    }

    @Override
    public int remove(int number) {
        int removeElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                removeElement = array[i];
                array[i] = 0;
                return removeElement;
            }
        }
        return removeElement;


    }

    @Override
    public int removeByIndex(int index) {
        int removeElement = array[index];
        array[index] = 0;
        return removeElement;
    }

    @Override
    public boolean contains(int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean set(int index, int value) {
        if (index > size) {
            System.out.println(Constans.INVALID_VALUE);
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                array[i] = value;
                return true;
            }
        }
        return false;
    }

    @Override
    public void print() {
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                System.out.print(array[i] + " ]");
            } else if (i == 0) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i] + ", ");
            }

        }

    }

    @Override
    public int[] toArray() {
        int[] arAfterRemove = new int[size];
        for (int i = 0; i < size; i++) {
            arAfterRemove[i] = array[i];
        }
        return arAfterRemove;
    }

    @Override
    public boolean removeAll(int[] ar) {
        int[] afterRemove = new int[size];
        for (int i = 0; i < ar.length; i++) {
            for (int a = 0; a < size; a++) {
                if (array[a] == ar[i]) {
                    size--;

                } else if (!contains(ar[i])) {
                    afterRemove[a] = array[a];
                }
            }
        }


        array = afterRemove;
        return true;
    }
}
