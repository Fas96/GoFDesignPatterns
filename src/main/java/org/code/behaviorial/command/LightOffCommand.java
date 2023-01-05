package org.code.behaviorial.command;

public class LightOffCommand implements Command {
    public  Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }
    public void execute() {
        light.switchOff();
    }
}
