package com.company;

public class Main {

    public static void main(String[] args) {
        start();
        // write your code here
    }










    public static void start() {
        GuessNumber guessNumber = new GuessNumber();
        guessNumber.inputMaxMinChance();
        guessNumber.validation();
        guessNumber.randomValue();
        guessNumber.welcomeGuessNumber();
        guessNumber.guessNumberWork();
    }
}
