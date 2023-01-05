package org.code.behaviorial.command;

public class CommandDemo {
    RemoteControl control = new RemoteControl();
    Light light = new Light();
    Command lightOn = new LightOnCommand(light);
    Command lightOff = new LightOffCommand(light);

    public void run() {
        control.setCommand(lightOn);
        control.pressButton();
        control.setCommand(lightOff);
        control.pressButton();
    }

    public static void main(String[] args) {
        CommandDemo demo = new CommandDemo();
        demo.run();
    }
}
