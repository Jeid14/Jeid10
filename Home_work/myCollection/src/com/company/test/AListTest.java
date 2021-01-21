package com.company.test;

import com.company.IList;
import com.company.impl.AList;
import com.company.impl.AList2;
import com.company.utils.Constans;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class AListTest {

    @Test
    public void AlistTest(){
        IList myCol = new AList(new int[]{55,44,44,2,3,4});
        myCol.add(33);
        System.out.println(myCol.size());
        System.out.println(Arrays.toString(myCol.toArray()));


    }
    @Test
    public void AListTestAddByIndex(){
        AList2 meCol = new AList2();
       meCol.add("ffd");
       meCol.print();
       meCol.add(1,"4");
       meCol.remove("4");
       meCol.print();


    }
}