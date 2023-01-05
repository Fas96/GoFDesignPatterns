package org.code.behaviorial.visitor;

public class XMLExportVisitor implements  ExportVisitor{

    @Override
    public void visit(IndustrialBuilding industrialBuilding) {
        System.out.println("Exporting IndustrialBuilding to XML");
    }

    @Override
    public void visit(ShoppingCenter shoppingCenter) {

        System.out.println("Exporting ShoppingCenter to XML");
    }

    @Override
    public void visit(Park park) {

        System.out.println("Exporting Park to XML");
    }

    @Override
    public void visit(PrivateBuilding privateBuilding) {

        System.out.println("Exporting PrivateBuilding to XML");

    }
}
