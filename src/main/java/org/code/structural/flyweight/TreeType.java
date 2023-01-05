package org.code.structural.flyweight;

import java.awt.*;

public class TreeType {
    private String _name;
    private final Color _color;
    private String _otherTreeData;

    public TreeType(String name, Color color, String texture) {
          this._name = name;
          this._color = color;
          this._otherTreeData = texture;
    }

    public void draw(Graphics g,int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(this._color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}
