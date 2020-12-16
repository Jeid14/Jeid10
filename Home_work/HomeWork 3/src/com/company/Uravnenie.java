package com.company;

public class Uravnenie {
    double e ;
    double x ;
    double temp = 6*(Math.log(Math.sqrt(Math.pow(e,x+1)+2*Math.pow(e,x)*Math.cos(x))));
    double temp2 = Math.log(x-Math.pow(e,x+1)*Math.sin(x));
    double temp3 = Math.abs(Math.cos(x)/Math.pow(e,Math.sin(x)));

    public void  woork(){
        double res = temp/temp2 + temp3;
        System.out.println(res);

    }
}