package org.code.structural.bridge;

public class AdvancedRemoteControl  extends   BasicRemoteControl {
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
