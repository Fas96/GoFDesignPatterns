package org.code.behaviorial.visitor;

public class IndustrialBuilding implements GeoElement {
    private String _name;
    private int _numberOfFloors;
    private int _numberOfRooms;
    private double _height;
    private double _width;
    private String  _address;

    public IndustrialBuilding(String name,  int numberOfRooms) {
        this._name = name;
        this._numberOfRooms = numberOfRooms;
    }

    public String getName() {
        return this._name;
    }

    public int getNumberOfFloors() {
        return this._numberOfFloors;
    }

    public int getNumberOfRooms() {
        return this._numberOfRooms;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public double getHeight() {
        return this._height;
    }

    public void setHeight(double height) {
        this._height = height;
    }

    public double getWidth() {
        return this._width;
    }

    public void setWidth(double width) {
        this._width = width;
    }

    public String getAddress() {
        return this._address;
    }

    public void setAddress(String address) {
        this._address = address;
    }




}
