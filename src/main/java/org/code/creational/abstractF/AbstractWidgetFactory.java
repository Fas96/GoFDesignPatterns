package org.code.creational.abstractF;


import org.code.creational.abstractF.entities.Button;
import org.code.creational.abstractF.entities.Scroll;

public interface AbstractWidgetFactory {
    public Window createWindow() ;
    public Scroll createScroll() ;
    public Button[] createNavigationButtons() ;
}
