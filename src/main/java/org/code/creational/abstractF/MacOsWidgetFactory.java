package org.code.creational.abstractF;

import org.code.creational.abstractF.entities.Button;
import org.code.creational.abstractF.entities.Scroll;
import org.code.creational.abstractF.entities.mac.MacOsButton;
import org.code.creational.abstractF.entities.mac.MacOsScroll;

public class MacOsWidgetFactory implements AbstractWidgetFactory{
    @Override
    public Window createWindow() {
        return new MacOsWindow();
    }

    @Override
    public Scroll createScroll() {
        return new MacOsScroll();
    }

    @Override
    public Button[] createNavigationButtons() {
        return  new Button[]{
                new MacOsButton("Close Window"),
                new MacOsButton("Expand Window"),
                new MacOsButton("Collapse Window"),
                new MacOsButton("Back"),
        };
    }

}
