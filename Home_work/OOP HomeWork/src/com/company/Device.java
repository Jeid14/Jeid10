package com.company;

import java.util.Arrays;

public class Device {
    public Processor processor;
    public Memory memory;


    @Override
    public String toString() {
        return "Device " +
                  processor +
                  memory ;
    }

    public Device(Memory memory, Processor processor) {
        this.memory = memory;
        this.processor = processor;
    }
    public Device(){

    }

    public void save(String[] data) {
        for (String s : data) {
            memory.save(s);
        }
    }

    public String[] readAll() {
        String[] res = memory.memoryCell;
//        for(String s: res){
//            System.out.println(s);
//        }
        System.out.println(Arrays.toString(res));
        for(int i=0;i<memory.memoryCell.length;i++){
           res[i] = null;
        }
        return res;

    }
    public void dataProcessing(){
        for (int i = 0; i < memory.memoryCell.length; i++) {
            if (memory.memoryCell[i] != null) {
                String temp = memory.memoryCell[i].toUpperCase();
                memory.memoryCell[i] = temp;
            }
        }
    }
    public  String getSystemInfo() {
        return "Processor: " + processor + "\nMemory: " + memory;
    }
}
