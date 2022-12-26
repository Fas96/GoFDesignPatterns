package org.code.creational.prototype;

import java.io.File;

public class PrototypeCreationalPatternTest {
    public static void main(String[] args) {
        String[] archiveTypes = {"zip", "rar"};
        for (String archiveType : archiveTypes) {
            Archiver archiver = ArchiverFactory.getArchiver(archiveType);
            archiver.archive(new File("C:\\Users\\User\\Desktop\\test"));
        }

    }
}
