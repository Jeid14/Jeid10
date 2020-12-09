package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        welcomToRandomize();
        start();


	// write your code here
    }











    public static void  welcomToRandomize(){
        System.out.println("Есть 3-ри команды:");
        System.out.println("Generate");
        System.out.println("Exit");
        System.out.println("Help");
        System.out.println("Но сначало установи границы!");

    }










    public static int[] start(){
        boolean isWork = true;
        Scanner scanner = new Scanner(System.in);
        int [] arrayWorked = createArray();
        while (isWork) {
            System.out.println("GENERATE   EXIT   HELP");
            String userComand = scanner.nextLine();
            if (userComand.equalsIgnoreCase("generate")) {
                int randomIndex = getRandomValue(arrayWorked);
                System.out.println(arrayWorked[randomIndex]);
               // System.out.println(Arrays.toString(arrayWorked));
                int[] arrayWorkedAfterDelete = deleteEllementAfterRandom(arrayWorked, randomIndex);
                arrayWorked = arrayWorkedAfterDelete;
                if (arrayWorked.length == 0) {
                    System.out.println("Не осталось новых значений");
                    System.out.println("Выйти?");
                    String answer = scanner.nextLine();
                    if (answer.equalsIgnoreCase("yes")){
                        break;
                    }
                    else {
                        System.out.println("Установим новые значения!");
                        createArray();
                    }
                }
            }
            if(userComand.equalsIgnoreCase("exit")){
                    System.out.println("Вы уверены?");
                    String answer = scanner.nextLine();
                    if(answer.equalsIgnoreCase("yes")){
                        isWork = false;
                    }
                    else {
                        System.out.println("Значит продолжаем");
                        //System.out.println("GENERATE   EXIT    HELP");
                    }
                }
            if(userComand.equalsIgnoreCase("help")){
                    System.out.println("Сменить диапазон чисел?");
                    String answer = scanner.nextLine();
                    if(answer.equalsIgnoreCase("yes")){
                        arrayWorked = createArray();
                    }
                    else{
                        System.out.println("Значит продолжаем");
                       // System.out.println("GENERATE   EXIT    HELP");
                        continue;
                    }

                }


            }

        return arrayWorked;

    }







    public static int getRandomValue(int[]array){
        Random random= new Random();
        int randomIndex = random.nextInt((array.length));
       // int randomValue = array[randomIndex];
        return randomIndex;
    }


    public  static int [] createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите минимальное значение:  ");
        int min = scanner.nextInt();
        System.out.println("Введите максимальное значение: ");
        int max = scanner.nextInt();
        if(min>max){

            System.out.println("Неверные границы! Введите заново");
            min = scanner.nextInt();
            System.out.println("Введите минимальное значение:  ");

            System.out.println("Введите максимальное значение: ");
             max = scanner.nextInt();

        }
        if (min <= 0) {
            System.out.println("Число не могут быть меньше 1");
            System.out.println("Заново введите минимальное значение");
            min = scanner.nextInt();
        }
        if (max > 500) {
            System.out.println("Чисило не может быть больше 500");
            System.out.println("Заново введите максимальное значение");
        }
        int[] array = new int[(max - min) + 1];
        array[0] = min;
        for (int i = 1; i <= max; i++) {
            array[i] = min + i;
            if (array[i] >= max) {
                break;

            }
        }
        return array;
    }









    public static int[] deleteEllementAfterRandom(int[] arrayWorked,int randomIndex){
        if (randomIndex == 0) {
            int[] array2 = new int[arrayWorked.length-1];
            System.arraycopy(arrayWorked, 1, array2, 0, array2.length);
            arrayWorked = array2;
            //System.out.println(Arrays.toString(array));
        }
        else if (randomIndex == arrayWorked.length-1) {
            int[] array2 = new int[arrayWorked.length-1];
            for (int i = 0; i < arrayWorked.length-1; i++) {
                array2[i] = arrayWorked[i];
            }
            arrayWorked = array2;
            // System.out.println(Arrays.toString(array));
        }
        else {
            int[] array2 = new int[arrayWorked.length-1];
            for (int i = 0; i < arrayWorked.length; i++) {
                if (i > randomIndex) {
                    array2[i-1] = arrayWorked[i];
                }
                if (i == randomIndex) {
                    continue;
                }
                if (i < randomIndex) {
                    array2[i] = arrayWorked[i];
                }
            }
            arrayWorked = array2;
            // System.out.println(Arrays.toString(array));
        }
        //System.out.println(Arrays.toString(arrayWorked));
        return arrayWorked;


    }
    }
