package com.company.impl;

import com.company.IList;
import com.company.utils.Constans;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LListTest {


    @Test
    void clear() {

    }

    @Test
    void size() {

    }

    @Test
    void get() {

    }

    @Test
    void add() {
        IList list = new LList();
        list.add(1);
        list.add(2);
        list.add(3);
        Assertions.assertEquals(true,list.add(4));
        Assertions.assertEquals(true,list.add(0));
    }

    @Test
    void testAdd() {

    }

    @Test
    void remove() {
    }

    @Test
    void removeByIndex() {
    }

    @Test
    void contains() {
    }

    @Test
    void set() {
    }

    @Test
    void print() {
        IList list = new LList();
        list.add(1);
        list.add(2);

        list.print();

    }

    @Test
    void toArray() {
    }

    @Test
    void removeAll() {

    }
}