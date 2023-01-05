package org.code.behaviorial.command;

public class Light {
    private boolean isOn = false;

    public void switchOn() {
        isOn = true;
        System.out.println("Light is on");
    }

    public void switchOff() {
        isOn = false;
        System.out.println("Light is off");
    }
}
