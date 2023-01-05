package org.code.behaviorial.strategy;

public class RarCompressionStrategy implements CompressionStrategy {
    @Override
    public void compressFiles(java.util.List<java.io.File> files) {
        // using RAR approach

        System.out.println("Compressing files using RAR approach");
    }

}
