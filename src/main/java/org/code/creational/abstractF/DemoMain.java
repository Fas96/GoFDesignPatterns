package org.code.creational.abstractF;

public class DemoMain {
    public static void main(String[] args) {
        GUIBuilder builder = new GUIBuilder();

        AbstractWidgetFactory factory = null;
        String os = System.getProperty("os.name").toLowerCase();
        System.out.println(os);
        if (os.contains("mac")) {
            factory = new MacOsWidgetFactory();
        } else {
            factory = new MsWindowWidgetFactory();
        }

        builder.buildWindow(factory);
    }
}
