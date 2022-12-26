package org.code.creational.factory;

import java.io.File;

public class RarArchiver implements Archiver {
    @Override
    public void archive(File directory) {
        System.out.println("RarArchiver directory " + directory.getName() + " to zip");
    }

}
