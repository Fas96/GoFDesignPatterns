package org.code.creational.builder;

import jdk.jfr.DataAmount;
import lombok.Data;
import lombok.ToString;

@Data
public class Computer {
    private String display;
    private String keyboard;
    private String systemBlock;
    private String manipulators;


    public String toString() {
        return "Computer [display=" + display + ", keyboard=" + keyboard + ", systemBlock=" + systemBlock + ", manipulators=" + manipulators + "]";
    }

}
