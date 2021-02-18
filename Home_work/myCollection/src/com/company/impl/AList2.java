package com.company.impl;

import com.company.IList2;
import com.company.utils.Constans;

import java.util.Arrays;

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
        array = new Object[]{};
        size = 0;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        if (index <= size) {
            return array[index];
        }
        throw new IllegalArgumentException(Constans.INVALID_VALUE);
    }

    @Override
    public boolean add(Object o) {
        increaseArrayCapacityIfRequired();
        array[size] = o;
        size++;
        return true;
    }

    @Override
    public boolean add(int index, Object o) {
        if (index < 0 || index > size) {
            return false;
        }
        increaseArrayCapacityIfRequired();
        for (int count = size; count > index; count--) {
            array[count] = array[count - 1];
        }
        array[index] = o;
        size++;
        return true;
    }

    @Override
    public Object remove(Object o) {
        int index = getIndexByValue(o);
        if (index == -1) {
            throw new IllegalArgumentException("Данного числа нет в коллекции");
        }
        return removeByIndex(index);
    }

    @Override
    public Object removeByIndex(int index) {
        isIndexSuitable(index);
        Object result = array[index];
        if (size == 1) {
            array = new Object[]{};
        }
        size--;
        for (int count = index; count < size; count++) {
            array[count] = array[count + 1];
        }
        return result;
    }

    @Override
    public boolean contains(Object o) {
        return getIndexByValue(o) >= 0;
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
        if (size == 0) {
            return;
        }
        System.out.println(toString());

    }

    public String toString() {
        StringBuilder result = new StringBuilder('[');
        for (int count = 0; count < size; count++) {
            if (count != size - 1) {
                result.append(array[count]).append(", ");
            } else {
                result.append(array[count]).append(']');
            }
        }
        return result.toString();
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
        if (ar == null) {
            return false;
        }
        if (Arrays.equals(toArray(), ar)) {
            array = new Object[10];
            return true;
        }
        int removeCount = 0;
        for (Object anInt : ar) {
            int index = getIndexByValue(anInt);
            if (index != -1) {
                removeByIndex(index);
                removeCount++;
            }
        }
        return removeCount != 0;
    }

    private void increaseArrayCapacityIfRequired() {
        if (size < array.length - 1) {
            return;
        }
        Object[] saveArray = array;
        array = new Object[(int) (array.length * 1.5)];
        for (int count = 0; count < size; count++) {
            array[count] = saveArray[count];
        }
    }

    private int getIndexByValue(Object value) {
        for (int count = 0; count < size; count++) {
            if (array[count] == value) {
                return count;
            }
        }
        return -1;
    }

    private void isIndexSuitable(int index) {
        if (Arrays.equals(toArray(), new Object[]{})) {
            throw new IllegalArgumentException("Пустой массив");
        }
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Индекс не может быть больше количества элементов" +
                    " или меньше нуля");
        }
    }
}
