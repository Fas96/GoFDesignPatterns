package org.code.creational.abstractF;

import org.code.creational.abstractF.entities.Button;
import org.code.creational.abstractF.entities.Scroll;
import org.code.creational.abstractF.entities.windows.MSButton;
import org.code.creational.abstractF.entities.windows.MSScroll;

public class MsWindowWidgetFactory implements AbstractWidgetFactory{
    @Override
    public Window createWindow() {
        return new MSWindow();
    }

    @Override
    public Scroll createScroll() {
        return new MSScroll();
    }

    @Override
    public Button[] createNavigationButtons() {
        return  new Button[]{
                new MSButton("Close Window"),
                new MSButton("Expand Window"),
                new MSButton("Collapse Window"),
                new MSButton("Back"),
        };
        
    }
}
