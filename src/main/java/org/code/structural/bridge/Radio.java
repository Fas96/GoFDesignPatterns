package org.code.structural.bridge;

public class Radio implements Device {
    public Radio(boolean enabled, int volume, int channel) {
    }

    public Radio() {

    }

    public boolean isEnabled() {
        return false;
    }

    public void enable() {
    }

    public void disable() {
    }

    public int getVolume() {
        return 0;
    }

    public void setVolume(int percent) {
    }

    public int getChannel() {
        return 0;
    }

    public void setChannel(int channel) {
    }

    public void printStatus() {
    }


}
