package com.company;

import java.util.Locale;

public class ProcessorArm extends Processor {
    @Override
    public String toString() {
        return "ProcessorArm{" +
                "frequency=" + frequency +
                ", cache=" + cache +
                ", bitCapacity=" + bitCapacity +
                ", architecture='" + architecture + '\'' +
                '}';
    }

    private final String architecture = "ARM";

    public ProcessorArm(double frequency, int cache, int bitCapacity) {
        super(frequency, cache, bitCapacity);
    }


    @Override
    public String dataProcess(String data) {
        return data.toUpperCase(Locale.ROOT);
    }

    @Override
    public String dataProcess(long data) {
        return String.valueOf(data).toUpperCase(Locale.ROOT);
    }

    @Override
    public String getArchitecture() {
        return architecture;
    }
}
