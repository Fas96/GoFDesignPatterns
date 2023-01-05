package org.code.behaviorial.visitor;

public class ShoppingCenter implements GeoElement {
    private String _name;
    private int _area;

    public ShoppingCenter(String name, int area) {
        this._name = name;
        this._area = area;
    }

    public String getName() {
        return this._name;
    }

    public int getArea() {
        return this._area;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
