package org.code.structural.flyweight;

import java.awt.*;

public class FlyWayDemoTest {
    private static final int CANVAS_SIZE = 700;
    private static final int TREES_TO_DRAW = 1000;
    private static final int TREE_TYPES = 2;

    public static void main(String[] args) {
        Forest forest = new Forest();
        for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Summer Oak",Color.GREEN, "Oak texture stub");
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
        }
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        System.out.println("Total trees: " + TREES_TO_DRAW);
        System.out.println("-------------------------");
        System.out.println("Memory usage:");
        System.out.println("Tree size (8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPES + "");
        System.out.println("-------------------------");
        System.out.println("Total: " + ((TREES_TO_DRAW * 8.0 + TREE_TYPES * 30.0) / 1024 / 1024) + "MB (instead of " + ((TREES_TO_DRAW * 38.0) / 1024 / 1024) + "MB)");




    }

    private static int random(int i, int canvasSize) {
        return (int) (Math.random() * canvasSize);
    }
}
