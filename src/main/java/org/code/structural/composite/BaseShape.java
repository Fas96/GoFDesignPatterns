package org.code.structural.composite;

import java.awt.*;

public class BaseShape implements Shape {
    private int _x;
    private int _y;
    private  Color _color;
    private Boolean _selected=false;

    public BaseShape(int x, int y, Color color) {
        this._x = x;
        this._y = y;
        this._color = color;
    }
    public int getX(){
        return this._x;
    }
    public int getY(){
    return this._y;
    }
    public int getWidth(){
        return 0;
    }
    public int getHeight() {
        return 0;
    }
    public Boolean isInsideBounds(int x, int y){
        return x >= this._x && x <= this._x + this.getWidth() && y >= this._y && y <= this._y + this.getHeight();
    }
    public void select(){
        this._selected=true;
    }
    public void unSelect(){
        this._selected=false;
    }
    public Boolean isSelected(){
        return this._selected;

    }
    public void paint(Graphics graphics) {
        graphics.setColor(this._color);
        graphics.fillRect(this._x, this._y, 100, 100);
    }
}
