package com.company;

public abstract class Processor {
    double frequency;
    int cache;
    int bitCapacity;
    String Architecture;


    public Processor(double frequency, int cache, int bitCapacity) {
        this.frequency = frequency;
        this.cache = cache;
        this.bitCapacity = bitCapacity;
    }
    public String getDetails(){
        return String.format("Частота : %s" +
                "Кеш: +%s:" +
                "Роздядость: +%s",frequency,cache,bitCapacity);
    }
    public abstract String dataProcess(String data);
    public abstract String dataProcess(long data);
    public abstract String getArchitecture();


}
