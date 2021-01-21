package com.company.impl;

import com.company.IList2;
import com.company.utils.Constans;

public class AList2 implements IList2 {
   private Object[] array;
    private static final int DEFAUL_CAPACITY = 10;
    private int size = 0;

    public AList2() {
        this.array = new Object[DEFAUL_CAPACITY];

    }

    public AList2(Object[] array) {
        this.array = array;
        for (int i = 0; i < array.length; i++) {
            size++;
        }
    }

    public AList2(int capacity) {
        if (capacity < 0) {
            System.out.println(Constans.INVALID_VALUE);
        }
        this.array = new Object[capacity];
    }
    @Override
    public void clear() {
        array = new Object[][]{};
        size = 0;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        if (index >= size) {
            return array[index];
        }
        throw new IllegalArgumentException(Constans.INVALID_VALUE);
    }

    @Override
    public boolean add(Object o) {
        if (array.length > size) {
            array[size++] = o;
            return true;
        } else {
            Object[] afterCopy = new Object[size * 2];
            for (int i = 0; i < size; i++) {
                afterCopy[i] = array[i];
            }
            afterCopy[size++] = o;
            array = afterCopy;

            return true;
        }
    }

    @Override
    public boolean add(int index, Object o) {
        if (index > size) {
            System.out.println(Constans.INVALID_VALUE.concat(" Не смогли добавить на позицию " + index + " Object " + o));
            return false;
        }
        Object[] afterAdd = new Object[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                afterAdd[i] = o;
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
    public Object remove(Object o) {
        Object removeElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == o) {
                removeElement = array[i];
                array[i] = 0;
                return removeElement;
            }
        }
        return removeElement;
    }

    @Override
    public Object removeByIndex(int index) {
        Object removeElement = array[index];
        array[index] = 0;
        return removeElement;
    }

    @Override
    public boolean contains(Object o) {
        for (Object i : array) {
            if (i == o) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean set(int index, Object o) {
        if (index > size) {
            System.out.println(Constans.INVALID_VALUE);
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                array[i] = o;
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
    public Object[] toArray() {
        Object[] arAfterRemove = new Object[size];
        for (int i = 0; i < size; i++) {
            arAfterRemove[i] = array[i];
        }
        return arAfterRemove;
    }

    @Override
    public boolean removeAll(Object[] ar) {
        Object[] afterRemove = new Object[size];
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
