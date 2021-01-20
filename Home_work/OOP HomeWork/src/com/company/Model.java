package com.company;

public class Model {

    Memory memory1 = new Memory(new String[]{null,"2",null,null,null});
    Memory memory2 = new Memory(new String[]{null,null,"3",null});
    Memory memory3 = new Memory(new String[]{null,"4",null,"4"});
    Memory memory4 = new Memory(new String[]{null,"5","5","5"});


    Processor processor1 = new ProcessorArm(11,22,44);
    Processor processor2 = new ProcessorArm(22,33,44);

    Processor processor3 = new ProcessorX86(1,2,3);
    Processor processor4 = new ProcessorX86(4,5,6);
    Processor processor5 = new ProcessorX86(12,334,45);


    Device device1 = new Device(memory1,processor1);
    Device device2 = new Device(memory2,processor3);
    Device device3 = new Device(memory3,processor2);
    Device device4 = new Device(memory4,processor4);
    Device device5 = new Device(memory1,processor5);
}
