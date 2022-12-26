package org.code.creational.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class ComputerBuilder {
    protected Computer computer;
    public void createComputer() {
        computer = new Computer();
    }
    public void buildDisplay(String display) {
        computer.setDisplay(display);
    }
    public void buildKeyboard(String keyboard) {
        computer.setKeyboard(keyboard);
    }
    public void buildSystemBlock(String systemBlock) {
        computer.setSystemBlock(systemBlock);
    }
    public void buildManipulators(String manipulators) {
        computer.setManipulators(manipulators);
    }

}
