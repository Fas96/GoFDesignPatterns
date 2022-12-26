package org.code.creational.factory;

import java.io.File;

public class FactoryPatternTest {
    public static void main(String[] args) {
       var zipArchiver = ArchiverFactory.getArchiver("zip");
       var rarArchiver = ArchiverFactory.getArchiver("rar");

       zipArchiver.archive(new File("C:\\Users\\User\\Desktop\\test"));
       rarArchiver.archive(new File("C:\\Users\\User\\Desktop\\test"));

        System.out.println(zipArchiver==rarArchiver);
    }
}
