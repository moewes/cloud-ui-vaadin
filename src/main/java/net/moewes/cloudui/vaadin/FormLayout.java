package net.moewes.cloudui.vaadin;

import net.moewes.cloudui.UiComponent;

/**
 * Java wrapper for Vaadin web component vaadin-form-layout
 */
public class FormLayout extends UiComponent {

    /**
     * default constructor
     */
    public FormLayout() {
        super("vaadin-form");
    }

    /**
     * @param inputComponent input ui component
     * @param labelComponent label ui component
     */
    public void addFormItem(UiComponent inputComponent, UiComponent labelComponent) {
        UiComponent formItem = new UiComponent("vaadin-form-item");
        // formItem.getElement().setAttribute("style", "display: flex;justify-content: flex-end; padding: .5em;");
        // labelComponent.getElement().setAttribute("style", "padding: .5em 1em .5em 0; flex: 1; text-align: right;");
        // inputComponent.getElement().setAttribute("style", "flex: 2; padding: .5em");
        formItem.add(labelComponent, inputComponent);
        labelComponent.getElement().setAttribute("slot", "label");
        add(formItem);
    }

}
