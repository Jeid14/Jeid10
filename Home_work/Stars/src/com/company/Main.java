package com.company;

public class Main {

    public static void main(String[] args) {
        triangle6();
        triangle5();
        triangle3();
triangle2();
triangle1();
line();
fullSquare();
square();

        // write your code here
    }

    public static void fullSquare() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 7) {
                    System.out.print("*");
                }
                System.out.print("*  ");

            }
            System.out.println();
        }
    }

    public static void square() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 || i == 6) {
                    System.out.print("*  ");
                } else if (j == 0 || j == 6) {
                    System.out.print("*   ");
                } else System.out.print("   ");

            }
            System.out.println();
        }
    }

    public static void triangle1() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0) {
                    System.out.print("*  ");


                }
                if (i != 0) {
                    if (j == 0 || j == 6 - i) {
                        System.out.print("* ");
                    } else
                        System.out.print("   ");
                }


            }
            System.out.println();
        }

    }

    public static void triangle2() {
        XZ1:
        for (int i = 0; i < 7; i++) {
            XZ2:
            for (int j = 0; j < 7; j++) {
                if (j == 0) {
                    System.out.print("* ");
                } else if (i == 6) {
                    System.out.print("* ");
                } else if (i == j && i != 0 && i != 6) {
                    System.out.print("* ");
                } else if (i != 0 && i != 6 && i != j) {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void triangle3() {
        for (int i = 0; i < 7; i++) {

            for (int j = 0; j < 7; j++) {
                if (i == 6) {
                    System.out.print("*  ");
                }
                if (i != 6 && j != 7 - i) {
                    System.out.print("  ");
                } else if (i != 6 && j == 7 - i) {
                    System.out.print("*    ");
                }
                if (j == 6 && i != 6) {
                    System.out.print("  *");
                }

            }
            System.out.println();


        }

    }

    public static void line() {
        for (int i = 0; i < 7; i++) {

            for (int j = 0; j < 7; j++) {
                if (i == j || i == 6 - j) {
                    System.out.print("*");
                } else System.out.print("  ");

            }
            System.out.println();

        }
    }

    public static void triangle5() {
        for (int i = 0; i < 7; i++) {

            for (int j = 0; j < 7; j++) {
                if (i == 0) {
                    System.out.print("*");
                }
                if ((i == 1 && j == 1) || (i == 1 && j == 5)) {
                    System.out.print("* ");
                }
                if ((i == 2 && j == 2) || (i == 2 && j == 4)) {
                    System.out.print("* ");
                }
                if (i == 3 && j == 3) {
                    System.out.print(" * ");
                } else System.out.print("   ");

            }
            System.out.println();
        }
    }

    public static void triangle6() {
        for (int i = 0; i < 7; i++) {

            for (int j = 0; j < 7; j++) {
                if (i == 6) {
                    System.out.print("* ");
                }
                if(i==5){
                    if(j==1||j==5){
                        System.out.print("*");
                    }
                    System.out.print("  ");
                }
                if(i==4){
                    if(j==2||j==4){
                        System.out.print("*");
                    }
                    System.out.print("  ");
                }
                if(i==3&&j==3){
                    System.out.print("      *");
                }
                else System.out.print(" ");
            }
            System.out.println();

        }
    }
}
