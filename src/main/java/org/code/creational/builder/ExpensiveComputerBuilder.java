package org.code.creational.builder;

public class ExpensiveComputerBuilder extends ComputerBuilder{
    @Override
    public void buildDisplay(String display) {
        computer.setDisplay(display);
    }

    @Override
    public void buildKeyboard(String keyboard) {
        computer.setKeyboard(keyboard);
    }

    @Override
    public void buildSystemBlock(String systemBlock) {
        computer.setSystemBlock(systemBlock);
    }

    @Override
    public void buildManipulators(String manipulators) {
        computer.setManipulators(manipulators);
    }
}
