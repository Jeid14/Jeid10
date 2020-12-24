package com.company.java;

public class Conditional1 {
    public int even(int a, int b) {
        int res = 0;
        if (a % 2 == 0) {
            res = a * b;
        } else {
            res = a + b;
        }
        return res;
    }

    public String coordinat(int x, int y) {
        String s = null;
        if ((x >= 0) && (y > 0)) {
            s = "I-я";
        }
        if ((x >= 0) && (y < 0)) {
            s = "II-я";
        }
        if ((x <= 0) && (y > 0)) {
            s = "IV-я";
        }
        if ((x <= 0) && (y < 0)) {
            s = "III-я";
        }
        if ((x == 0) && (y == 0)) {
            s = "В начале координат";
        }
        if ((x == 0) && (y != 0)) {
            s = "На оси X";
        }
        if ((x != 0) && (y == 0)) {
            s = "На оси Y";

        }
        return s;
    }
    public int justPositive(int[] array){
        int res = 0;
        for (int num : array) {
            if (num > 0)
                res = res + num;
        }
        return res;
    }

    public int sumOrMultiply(int x,int y,int z){
        int res = 0;
        if((x*y*z)>(x+y+z))
            res = (x*y*z) +3;
        else res = (x+y+z)+3;
        return res;
    }
    public String ozenka(int a){
        String ozenka = "";
        if ((a>=0) &( a<=19)){
           ozenka = "F";
        }
        if ((a>19) &( a<=39)){
            ozenka = "E";
        }
        if ((a>39) &( a<=59)){
            ozenka = "D";
        }
        if ((a>59) &( a<=74)){
            ozenka = "C";
        }
        if ((a>74) &( a<=89)){
            ozenka = "B";
        }
        if ((a>89) &( a<=100)){
            ozenka = "A";
        }
        if (a<0 ){
            ozenka = "Мало балов";
        }
        if (a>100){
            ozenka = "Слишком много балов";
        }
        return ozenka;
    }

}
