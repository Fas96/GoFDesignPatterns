package org.code.creational.factory;

import java.io.File;

public class ZipArchiver implements Archiver {
    @Override
    public void archive(File directory) {
        System.out.println("Archiving directory " + directory.getName() + " to zip");
    }

}
