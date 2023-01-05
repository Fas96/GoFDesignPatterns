package org.code.behaviorial.visitor;

public class VisitorsDemo {
    public static void main(String[] args) {
        GeoElement[] geoElements = new GeoElement[]{
                new IndustrialBuilding("Industrial Building", 1000),
                new ShoppingCenter("Shopping Center", 2000),
                new Park("Park", 3000),
                new PrivateBuilding("Private Building", 4000)
        };

        ExportVisitor visitor = new XMLExportVisitor();
        visitor.export(geoElements);
        System.out.println("===================================");
        ExportVisitor exportVisitor = new JSONExportVisitor();
        exportVisitor.export(geoElements);
    }
}
