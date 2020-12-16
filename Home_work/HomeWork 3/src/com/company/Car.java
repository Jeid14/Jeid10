package com.company;

public class Car {
    double t;
    double s;
    double v1;
    double v2;
    public Car(){

    }

public Double goCar1(){
        double car1Distanse = v1*t;
        return car1Distanse;


}

public void allDistance(){
        double allDistance = Math.abs(s+(v1+v2)*t);
    System.out.println(allDistance);
}


}

