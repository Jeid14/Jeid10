package com.company;

import java.util.Locale;

public class ProcessorX86 extends Processor{
    private final String architecture = "X86";
    public ProcessorX86(double frequency, int cache, int bitCapacity) {
        super(frequency, cache, bitCapacity);
    }

    @Override
    public String dataProcess(String data) {
        return data.toLowerCase(Locale.ROOT);
    }

    @Override
    public String dataProcess(long data) {
        return String.valueOf(data).toLowerCase(Locale.ROOT);
    }

    @Override
    public String toString() {
        return "ProcessorX86{" +
                "frequency=" + frequency +
                ", cache=" + cache +
                ", bitCapacity=" + bitCapacity +
                ", architecture='" + architecture + '\'' +
                '}';
    }
    @Override
    public String getArchitecture(){
        return architecture;
    }
}
