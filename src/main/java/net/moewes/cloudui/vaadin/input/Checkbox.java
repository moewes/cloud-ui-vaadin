package net.moewes.cloudui.vaadin.input;

import net.moewes.cloudui.UiComponent;

public class Checkbox extends UiComponent {

    public Checkbox() {
        super("vaadin-checkbox");
    }

    public Checkbox(String label) {
        this();
        setLabel(label);
    }

    public void setLabel(String label) {
        getElement().setAttribute("label",label);
    }
}
