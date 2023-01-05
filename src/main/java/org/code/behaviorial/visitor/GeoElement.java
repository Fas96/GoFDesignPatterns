package org.code.behaviorial.visitor;

public interface GeoElement {
    void accept(Visitor v);
}
