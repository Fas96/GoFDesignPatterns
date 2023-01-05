package org.code.structural.flyweight;

import java.awt.*;

public class TreeTypeFactory {
    private static final java.util.Map<String, TreeType> _treeTypes = new java.util.HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType result = _treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            _treeTypes.put(name, result);
        }
        return result;
    }
}
