package net.moewes.cloudui.vaadin;

import net.moewes.cloudui.UiComponent;

/**
 * Java wrapper for Vaadin web component vaadin-vertical-layout
 */
public class VerticalLayout extends UiComponent {

    public VerticalLayout() {
        super("vaadin-vertical-layout");
    }

    /**
     * Create VerticalLayout with Elements
     * @param components Elements to add
     */
    public VerticalLayout(UiComponent... components) {
        this();
        add(components);
    }
}
