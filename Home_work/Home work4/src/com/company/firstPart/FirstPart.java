package com.company.firstPart;

public class FirstPart {
    public void alfabeta_z() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }

    }

    public void alfabetA_Z() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
    }
    public void alfabetА_Я() {
        for (char i = 'а'; i <= 'я'; i++) {
            System.out.print(i + " ");
        }
    }
    public void numbs0_9(){
        for (int i=0;i<=9;i++){
            System.out.print(i+" ");
        }
    }
    public void charACII(){
        for(char i=32;i<=126;i++){
            System.out.print(i+" ");
        }
    }
}
