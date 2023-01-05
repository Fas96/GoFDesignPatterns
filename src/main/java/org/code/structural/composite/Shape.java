package org.code.structural.composite;

import java.awt.*;

public interface Shape {
    public int getX();
    public int getY();
    public int getWidth();
    public int getHeight();
    public Boolean isInsideBounds(int x, int y);
    public void select();
    public void unSelect();
    public Boolean isSelected();
    public void paint(Graphics graphics);
}
