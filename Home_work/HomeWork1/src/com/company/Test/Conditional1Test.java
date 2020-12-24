package com.company.Test;

import com.company.java.Conditional1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Conditional1Test extends Conditional1 {
    @Test
    public void evenTestNotEven(){
        int a =21;
        int b = 4;
        int ex = even(a,b);
        Assertions.assertEquals(ex,25);

    }
@Test
    public void evenTestEven(){
        int a =20;
        int b = 4;
        int ex = even(a,b);
        Assertions.assertEquals(ex,80);

    }
        @Test
    public void evenTestWithMinus(){
        int a =-2;
        int b = 4;
        int ex = even(a,b);
        Assertions.assertEquals(ex,-8);

    }
    @Test
    public void evenTesWithNull() {
        int a = 0;
        int b = 4;
        int ex = even(a, b);
        Assertions.assertEquals(ex, 0);
    }
    @Test
    public void coordinatTestI(){
        int x = 4;
        int y = 9445;
        String s = coordinat(x,y);
        Assertions.assertEquals(s,"I-я");
    }
    @Test
    public void coordinatTestII(){
        int x = 4;
        int y = -9445;
        String s = coordinat(x,y);
        Assertions.assertEquals(s,"II-я");
    }
    @Test
    public void coordinatTestIII(){
        int x = -4;
        int y = -9445;
        String s = coordinat(x,y);
        Assertions.assertEquals(s,"III-я");
    }
    @Test
    public void coordinatTestIV(){
        int x = -4;
        int y = 9445;
        String s = coordinat(x,y);
        Assertions.assertEquals(s,"IV-я");
    }
    @Test
    public void coordinatTestV0(){
        int x =0;
        int y = 0;
        String s = coordinat(x,y);
        Assertions.assertEquals(s,"В начале координат");
    }
    @Test
    public void coordinatTestOsX(){
        int x =0;
        int y = 353;
        String s = coordinat(x,y);
        Assertions.assertEquals(s,"На оси X");
    }
    @Test
    public void coordinatTestOsY(){
        int x =123;
        int y = 0;
        String s = coordinat(x,y);
        Assertions.assertEquals(s,"На оси Y");
    }
    @Test
    public void justPositivTestAllPositiv(){
       int[] array = {1,2,3};
        int ex = justPositive(array);
        Assertions.assertEquals(ex,6);
    }
    @Test
    public void justPositivTestXandYPositiv(){
        int[] array = {1,2,-3};
        int ex = justPositive(array);
        Assertions.assertEquals(ex,3);
    }
    @Test
    public void justPositivTestXandZPositiv(){
        int[] array = {1,-2,3};
        int ex = justPositive(array);
        Assertions.assertEquals(ex,4);
    }
    @Test
    public void justPositivTestNONPositiv(){
        int[] array = {-1,-2,-3};
        int ex = justPositive(array);
        Assertions.assertEquals(ex,0);
    }
    @Test
    public void justPositivTestNull(){
        int[] array = {0,0,0};
        int ex = justPositive(array);
        Assertions.assertEquals(ex,0);
    }

    @Test
    public void sumOrMultiplyTestSum(){
        int x =1;
        int y=1;
        int z=8;
        int ex = sumOrMultiply(x,y,z);
        Assertions.assertEquals(ex,13);
    }
    @Test
    public void sumOrMultiplyTestMulti(){
        int x =10;
        int y=1;
        int z=8;
        int ex = sumOrMultiply(x,y,z);
        Assertions.assertEquals(ex,83);
    }
    @Test
    public void sumOrMultiplyTestMinusValue(){
        int x =10;
        int y=-1;
        int z=8;
        int ex = sumOrMultiply(x,y,z);
        Assertions.assertEquals(ex,20);
    }
    @Test
    public void ozenka0(){
        int a = 0;
        String s = ozenka(a);
        Assertions.assertEquals(s,"F");
    }

    @Test
    public void ozenkaF(){
        int a = 19;
        String s = ozenka(a);
        Assertions.assertEquals(s,"F");
    }
    @Test
    public void ozenkaE(){
        int a = 39;
        String s = ozenka(a);
        Assertions.assertEquals(s,"E");
    }
    public void ozenkaA(){
        int a = 100;
        String s = ozenka(a);
        Assertions.assertEquals(s,"A");
    }
    @Test
    public void ozenkaBigValue(){
        int a = Integer.MAX_VALUE;
        String s = ozenka(a);
        Assertions.assertEquals(s,"Слишком много балов");
    }
}
