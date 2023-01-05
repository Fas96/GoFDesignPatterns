package org.code.behaviorial.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        CompressionContext context = new CompressionContext();
        context.createArchive(new java.util.ArrayList<>(), new ZipCompressionStrategy());
        context.createArchive(new java.util.ArrayList<>(), new RarCompressionStrategy());

        context.setStrategy(new ZipCompressionStrategy());
        context.createArchive(new java.util.ArrayList<>());
        context.setStrategy(new RarCompressionStrategy());

    }
}
