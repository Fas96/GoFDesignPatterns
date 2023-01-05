package org.code.behaviorial.strategy;

public class ZipCompressionStrategy implements CompressionStrategy {
    @Override
    public void compressFiles(java.util.List<java.io.File> files) {
        // using RAR approach

        System.out.println("Compressing files using ZIP approach");
    }

}
