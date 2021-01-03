package com.company.secondPart;

public class SecondPart {
    public String wholeNumbToString(long value){
        String result = Long.toString(value);
        return result;
    }
    public String numbsToString(double value){
        String result = Double.toString(value);
        return result;
    }
    public Long stringToWholeNumb(String value){
        long res  = Long.parseLong(value);
        return res;
    }
    public Double stringToDouble(String value){
        double res = Double.parseDouble(value);
        return res;
    }
}
