package com.company.impl;

import com.company.IList;
import com.company.utils.Constans;

import java.util.Arrays;

public class ArrayList1 implements IList {
    private int[] array;
    private static final int DEFAUL_CAPACITY = 10;
    private int size = 0;

    public ArrayList1() {
        this.array = new int[DEFAUL_CAPACITY];

    }

    public ArrayList1(int[] array) {
        this.array = array;
        for (int i = 0; i < array.length; i++) {
            size++;
        }
    }

    public ArrayList1(int capacity) {
        if (capacity < 0) {
            System.out.println(Constans.INVALID_VALUE);
        }
        this.array = new int[capacity];
    }


    @Override
    public void clear() {
        array = new int[DEFAUL_CAPACITY];
        size = 0;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int get(int index) {
        if (index <= size) {
            return array[index];
        }
        throw new IllegalArgumentException(Constans.INVALID_VALUE);
    }

    @Override
    public boolean add(int value) {
        increaseArrayCapacityIfRequired();
        array[size] = value;
        size++;
        return true;
    }

    @Override
    public boolean add(int index, int value) {
        if (index < 0 || index > size) {
            return false;
        }
        increaseArrayCapacityIfRequired();
        for (int count = size; count > index; count--) {
            array[count] = array[count - 1];
        }
        array[index] = value;
        size++;
        return true;
    }

    @Override
    public int remove(int number) {
        int index = getIndexByValue(number);
        if (index == -1) {
            throw new IllegalArgumentException("Данного числа нет в коллекции");
        }
        return removeByIndex(index);
    }

    @Override
    public int removeByIndex(int index) {
        isIndexSuitable(index);
        int result = array[index];
        if (size == 1) {
            array = new int[]{};
        }
        size--;
        for (int count = index; count < size; count++) {
            array[count] = array[count + 1];
        }
        return result;
    }

    @Override
    public boolean contains(int value) {
        return getIndexByValue(value) >= 0;
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
    public int[] toArray() {
        int[] arAfterRemove = new int[size];
        for (int i = 0; i < size; i++) {
            arAfterRemove[i] = array[i];
        }
        return arAfterRemove;
    }

    @Override
    public boolean removeAll(int[] ar) {
        if (ar == null) {
            return false;
        }
        if (Arrays.equals(toArray(), ar)) {
            array = new int[10];
            return true;
        }
        int removeCount = 0;
        for (int anInt : ar) {
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
        int[] saveArray = array;
        array = new int[(int) (array.length * 1.5)];
        for (int count = 0; count < size; count++) {
            array[count] = saveArray[count];
        }
    }

    private int getIndexByValue(int value) {
        for (int count = 0; count < size; count++) {
            if (array[count] == value) {
                return count;
            }
        }
        return -1;
    }

    private void isIndexSuitable(int index) {
        if (Arrays.equals(toArray(), new int[]{})) {
            throw new IllegalArgumentException("Пустой массив");
        }
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Индекс не может быть больше количества элементов" +
                    " или меньше нуля");
        }
    }
}
