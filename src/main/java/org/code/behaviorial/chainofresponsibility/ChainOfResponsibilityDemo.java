package org.code.behaviorial.chainofresponsibility;

public class ChainOfResponsibilityDemo {
    private DispenseChain c1;

    public ChainOfResponsibilityDemo() {
        // initialize the chain
        this.c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();

        // set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        ChainOfResponsibilityDemo atmDispenser = new ChainOfResponsibilityDemo();
        while (true) {
            // for testing
            int amount = 0;
            System.out.println("Enter amount to dispense");
            java.util.Scanner input = new java.util.Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amo unt should be in   of 10s.");
                return;
            }
            // process the request
            atmDispenser.c1.dispense(new Currency(amount));
        }
    }
}
