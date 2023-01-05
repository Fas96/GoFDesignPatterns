package org.code.behaviorial.visitor;

public class JSONExportVisitor implements  ExportVisitor{

    @Override
    public void visit(IndustrialBuilding industrialBuilding) {
        System.out.println("Exporting IndustrialBuilding to JSONExportVisitor");
    }

    @Override
    public void visit(ShoppingCenter shoppingCenter) {

        System.out.println("Exporting ShoppingCenter to JSONExportVisitor");
    }

    @Override
    public void visit(Park park) {

        System.out.println("Exporting Park to JSONExportVisitor");
    }

    @Override
    public void visit(PrivateBuilding privateBuilding) {

        System.out.println("Exporting PrivateBuilding to JSONExportVisitor");

    }
}
