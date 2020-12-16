package com.company;

public class Main {

    public static void main(String[] args) {
        randomValueRandomTime();
        // write your code here
    }

    public static void randomValue() {
        System.out.println(Math.random());
    }

    public static void tenRandomValue() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }
    }

    public static void tenRandomValueNullTen() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random() * 10);
        }
    }
    public static void tenRandomValue20to50(){
        for (int i = 0; i < 10; i++) {
            System.out.println(20+Math.random()*30);
        }

    }
    public static void tenRandomValueMinus10to10(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random()*20 -10);
        }

    }
    public static void randomValueRandomTime(){
        int time = (int) (3+Math.random()*5);
        System.out.println(time);
        for(int i=0;i<time;i++){
            System.out.println(Math.random()*45-10);
        }
    }
}
