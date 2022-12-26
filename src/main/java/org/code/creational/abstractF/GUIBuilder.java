package org.code.creational.abstractF;

import org.code.creational.abstractF.entities.Button;
import org.code.creational.abstractF.entities.Scroll;

public class GUIBuilder {
    public void  buildWindow(AbstractWidgetFactory widgetFactory) {
        Window window = widgetFactory.createWindow();
        Scroll scroll = widgetFactory.createScroll();
        Button[] buttons = widgetFactory.createNavigationButtons();

        // ... add scroll and buttons to the window ...
        window.setTitle("New Window");
        widgetFactory.createScroll();
        widgetFactory.createNavigationButtons();
    }
}
