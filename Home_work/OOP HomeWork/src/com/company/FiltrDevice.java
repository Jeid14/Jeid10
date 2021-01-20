package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiltrDevice {
    //    Device device = new Device();


    public List<Device> filterArchitecture(Device[] devices, String arch) {
        List<Device> afterFiltr = new ArrayList<>();

        for (Device device : devices) {
            if (device.processor.getArchitecture().equals(arch)) {
                System.out.println(device.getSystemInfo());
                afterFiltr.add(device);
                return afterFiltr;
            }
        }
        return afterFiltr;
    }

    public void filerAllMemmory(Device[] devices, int value) {
        List<Device> afterFiltr = new ArrayList<>();
        List<Device> divSmalMemoty = new ArrayList<>();
        for (Device device : devices) {
            if (device.memory.getMemorySize() >= value) {
                afterFiltr.add(device);
            } else {
                divSmalMemoty.add(device);
            }
        }
        System.out.println("Девайсы с памятью больше:" + value);
        for (Device device : afterFiltr) {
            System.out.println(device);
        }
        System.out.println("Девайсы с памятью меньше:" + value);
        for (Device device : divSmalMemoty) {

            System.out.println(device);
        }
    }

    public void filerFullMemmory(Device[] devices, int value) {
        List<Device> afterFiltr = new ArrayList<>();
        List<Device> divSmallerUsingMemory = new ArrayList<>();
        for (Device device : devices) {
            if (device.memory.getMemoryInfo() >= value) {
                afterFiltr.add(device);
            }
            else {
                divSmallerUsingMemory.add(device);
            }
        }
        System.out.println("Девайсы с использованой памятью больше:" + value);
        for (Device device : afterFiltr) {
            System.out.println(device);
        }
        System.out.println("Девайсы с использованой памятью меньше:" + value);
        for (Device device : divSmallerUsingMemory) {

            System.out.println(device);
        }
    }
}
