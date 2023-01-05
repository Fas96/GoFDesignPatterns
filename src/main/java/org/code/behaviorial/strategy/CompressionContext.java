package org.code.behaviorial.strategy;

public class CompressionContext {
    private CompressionStrategy strategy;

    public CompressionContext(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public CompressionContext() {

    }

    public void setStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }
    public void createArchive(java.util.List<java.io.File> files,CompressionStrategy cs) {
        cs.compressFiles(files);
    }
    public void createArchive(java.util.List<java.io.File> files) {
        strategy.compressFiles(files);
    }


}
