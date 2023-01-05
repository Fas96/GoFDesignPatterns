package org.code.behaviorial.visitor;

public interface Visitor {
        void visit(IndustrialBuilding industrialBuilding);
        void visit(ShoppingCenter shoppingCenter);
        void visit(Park park);
        void visit(PrivateBuilding privateBuilding);
}
