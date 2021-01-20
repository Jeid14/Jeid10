package com.company;

import java.util.Arrays;
import java.util.SortedMap;

public class Memory {
    String[] memoryCell;

    public Memory(String[] memoryCell) {
        this.memoryCell = memoryCell;
    }

    @Override
    public String toString() {
        return Arrays.toString(memoryCell);
    }

    public String readLast() {
        String last = null;
        for (String s : memoryCell) {
            if (s != null) {
                last = s;
            }
        }
        return last;
    }

    public String[] removeLast() {
        String last = readLast();
        for (int i = memoryCell.length - 1; i >= 0; i--) {
            if (memoryCell[i] != null) {
                if (memoryCell[i].equals(last)) {
                    memoryCell[i] = null;
                }
            } else continue;
        }
        return memoryCell;
    }

    public boolean save(String value) {
        int count = 0;
        for (int i = memoryCell.length - 1; i >= 0; i--) {
            if (memoryCell[i] == null && count == 0) {
                memoryCell[i] = value;
                count++;
                System.out.println("Записано " + memoryCell[i]);


            }

        }
        if (count == 0) {
            System.out.println("Память закончилась");
            System.out.println("Последнее записаное значение " + memoryCell[0]);
            return false;
        }

        return true;
    }

    public double getMemoryInfo() {
        String res = null;
        double full = 0;
        double size = memoryCell.length;
        double pros = 0;
        for (int i = 0; i < memoryCell.length; i++) {
            if (memoryCell[i] != null) {
                full++;

            }
        }
        if (full != 0) {
            pros = (full / size) * 100;
//            System.out.println("Всего: " + size + "." + " \nЗаполнено: " + pros + "%");
        } else {
//            System.out.println("Всего: " + size + " \nЗаполнено: 0%");
        }
        return pros;


    }

    public int getMemorySize() {
        return memoryCell.length;
    }

}
