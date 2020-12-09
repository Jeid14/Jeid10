package com.company;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int max;
    int min;
    int chance;
    int myChoise;
    int lastCoise;
    int randomValue;

    //    public GuessNumber( int min,int max, int chance) {
//
//    }
    public void randomValue() {
        randomValue = random.nextInt((max - min)) + min;
        //  return randomValue;
    }

    public void welcomeGuessNumber() {
        System.out.println("Привет я загадaл число, давай играть! " );
        System.out.println("Введи первое число а дальше я подскажу");
    }

    public void guessNumberWork() {
        //  lastAnswer();
        //  System.out.println(lastCoise);
        answer();
        int countCance = 1;
        boolean isWork = true;
        // int razniza = randomValue - myChoise;
        while (isWork) {
            if ((randomValue - myChoise) == 0) {
                System.out.println("Ты выиграл c " + countCance + " попытки");
                // countCance++;
                System.out.println("Повторим?");
                if (scanner.nextLine().equalsIgnoreCase("yes")) {
                    inputMaxMinChance();
                   // w = false;
                }
            }
            if (countCance == chance) {
                System.out.println("Попытки закончились. Ты проиграл!");
                System.out.println("Я загадал число " + randomValue);
                isWork = false;
                System.exit(0);
            }

            if ((randomValue - myChoise) != 0) {
                int distance = Math.abs(randomValue - myChoise);
                int lastDistance = Math.abs(randomValue - lastCoise);
                if (countCance > 1 && distance > lastDistance) {
                    System.out.println("Холоднее");
                }
                if (countCance > 1 && distance < lastDistance) {
                    System.out.println("Горячее");
                }

                System.out.println("следующая попытка");
                countCance++;
                lastAnswer();
                answer();


            }


        }
    }

    public void validation() {
        if (min < 0 || min > 100) {
            System.out.println("Минимум от 0 до 100!");
            inputMaxMinChance();
        }
        if (max < min || max > 200) {
            System.out.println("Максимум до 200");
            inputMaxMinChance();
        }
        if (chance <= 0 || chance > 15) {
            System.out.println("От 1 до 15 попыток");
            inputMaxMinChance();
        }

    }


    public void answer() {
        if (scanner.hasNextInt()) {
            myChoise = scanner.nextInt();

        }
    }

    public void lastAnswer() {
        lastCoise = myChoise;

    }


    public void inputMaxMinChance() {
        System.out.println("Введите минимальное значение: ");

        if (scanner.hasNextInt()) {
            min = scanner.nextInt();
        }

        System.out.println("Введите максимальное значение: ");
        if (scanner.hasNextInt()) {

            max = scanner.nextInt();
        }
        System.out.println("Сколько попыток хватит?");
        if (scanner.hasNextInt()) {
            chance = scanner.nextInt();

        }
        if (scanner.hasNextLine()) {
            String userComand = scanner.nextLine();
            if (userComand.equalsIgnoreCase("exit")) {
                System.exit(0);
            }
        }

    }
}



