package org.code.structural.bridge;

public class BridgeTestDemo {
    public static void main(String[] args) {
       Device tv = new TV();
       testDevice(tv);
        System.out.println("====================================");
       Device radio = new Radio();
       testDevice(radio);
        System.out.println("====================================");


    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemoteControl basicRemote = new BasicRemoteControl(device);
        basicRemote.power();
        device.printStatus();
        System.out.println("====================================");
        System.out.println("Tests with advanced remote.");
        AdvancedRemoteControl advancedRemote = new AdvancedRemoteControl(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
//    x=y/2
//    y=70
}
