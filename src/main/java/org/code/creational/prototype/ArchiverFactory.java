package org.code.creational.prototype;

import java.util.Map;

public class ArchiverFactory {
    private  static Map<String, Archiver> archivers = Map.of(
            "zip", new ZipArchiver(),
            "rar", new RarArchiver()
    );

    public static Archiver getArchiver(String type) {
        return archivers.get(type).clone();
    }

    //use switch case
    public static Archiver getArchiver2(String type) {
        switch (type) {
            case "zip":
                return new ZipArchiver().clone();
            case "rar":
                return new RarArchiver().clone();
            default:
                throw new IllegalArgumentException("Unknown type");
        }
    }
}
