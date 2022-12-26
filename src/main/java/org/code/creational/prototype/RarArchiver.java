package org.code.creational.prototype;


import org.apache.commons.lang3.SerializationUtils;

import java.io.File;
import java.io.Serializable;

public class RarArchiver implements Archiver, Serializable  {
    @Override
    public void archive(File directory) {
        System.out.println("RarArchiver Archiving directory " + directory.getName() + " to zip");
    }

    @Override
    public Archiver clone() {
//        return new RarArchiver();
        return (Archiver) SerializationUtils.clone(this);
    }
}
