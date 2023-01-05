package org.code.structural.flyweight;

import javax.swing.*;
import java.awt.*;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Forest extends JFrame{
    private final List<Tree> _trees= new java.util.ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = TreeTypeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        _trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : _trees) {
            tree.draw(graphics);
        }
    }
}
