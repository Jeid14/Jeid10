package com.company;

public interface IList2<T> {
    void clear();
    int size();
    T get(int index);
    boolean add(T t);
    boolean add(int index, T t);
    Object remove(T t);
    Object removeByIndex(int index);
    boolean contains(T t);
    boolean set(int index, T t);
    void print();
    Object[] toArray();
    boolean removeAll(T[]t);
}
