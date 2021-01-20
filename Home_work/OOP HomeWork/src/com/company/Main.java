package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        FiltrDevice filtrDevice = new FiltrDevice();

        Device[] devices = new Device[5];

        devices[0] = model.device1;
        devices[1] = model.device2;
        devices[2] = model.device3;
        devices[3] = model.device4;
        devices[4] = model.device5;
    filtrDevice.filerFullMemmory(devices,50);


    }


}
