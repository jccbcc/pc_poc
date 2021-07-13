package com.coleman.computer;

public class Main {

    Dimensions dimensions = new Dimensions(13,18,20);
    Case theCase = new Case("2208", "Dell", "240", dimensions);

    Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

    Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

    PC thePC = new PC(theCase, monitor, motherboard);




}
