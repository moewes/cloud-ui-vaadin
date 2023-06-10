package net.moewes.cloudui.vaadin;

import net.moewes.cloudui.UiComponent;

/**
 * Java wrapper for Vaadin web component vaadin-horizontal-layout
 */
public class HorizontalLayout extends UiComponent {

    public HorizontalLayout() {
        super("vaadin-horizontal-layout");
    }

    public HorizontalLayout(UiComponent... components) {
        this();
        add(components);
    }
}
