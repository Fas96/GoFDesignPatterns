package org.code.structural.flyweight;

import java.awt.*;

public class Tree {
    private final int _x;
    private final int _y;
    private final TreeType _type;

    public Tree(int x, int y, TreeType type) {
        this._x = x;
        this._y = y;
        this._type = type;
    }

    public void draw(Graphics g) {
        this._type.draw(g, this._x, this._y);
    }
}
