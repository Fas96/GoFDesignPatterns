package org.code.creational.factory;

import java.util.Map;
import java.util.function.Supplier;

public class ArchiverFactory {
    private static Map<String, Supplier<Archiver>> archiversMap = Map.of(
            "zip", ZipArchiver::new,
            "rar", RarArchiver::new
    );

    public static Archiver getArchiver(String type) {
       return archiversMap.get(type)==null?null:archiversMap.get(type).get();
    };
}
