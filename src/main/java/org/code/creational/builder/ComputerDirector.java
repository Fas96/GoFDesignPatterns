package org.code.creational.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComputerDirector {
    private ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void buildComputer(String display, String keyboard, String systemBlock, String manipulators) {
        computerBuilder.createComputer();
        computerBuilder.buildDisplay(display);
        computerBuilder.buildKeyboard(keyboard);
        computerBuilder.buildSystemBlock(systemBlock);
        computerBuilder.buildManipulators(manipulators);
    }

}
