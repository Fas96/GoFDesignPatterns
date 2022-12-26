package org.code.creational.builder;

public class CanonicalBuilderTest {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector(new CheapComputerBuilder());
        director.buildComputer("Samsung", "Logitech", "Asus", "Razer");

        Computer computer = director.getComputerBuilder().getComputer();
        System.out.println("Display: " + computer.getDisplay());
        System.out.println(computer);

        director = new ComputerDirector(new ExpensiveComputerBuilder());
        director.buildComputer("Mac", "M-2-Smart TOuch", "Silicon", "I-mart");


        computer = director.getComputerBuilder().getComputer();
        System.out.println("Display: " + computer.getDisplay());
        System.out.println(computer);
    }
}
