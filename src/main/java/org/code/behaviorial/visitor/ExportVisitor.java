package org.code.behaviorial.visitor;

public interface ExportVisitor extends Visitor{
    public default void export(GeoElement... geoElements) {
        for (GeoElement element : geoElements) {
            element.accept(this);
        }
    }
}
