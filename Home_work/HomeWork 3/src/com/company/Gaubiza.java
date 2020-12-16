package com.company;

public class Gaubiza {
    final double g = 9.80065;
//    double a;//угол
//    double v;//скорость в км/ч



    public Double shoot(double a,double v) {
        double vMs = ((v * 5) / 18);//скорость в м/с
        double aRad = Math.toDegrees(a);
        System.out.println(vMs);
        double distance = Math.abs((Math.pow(vMs,2)* 2*(Math.sin(aRad)*Math.cos(aRad)) / g) );
        return distance;

    }
}
