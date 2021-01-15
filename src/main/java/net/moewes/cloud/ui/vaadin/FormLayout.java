package net.moewes.cloud.ui.vaadin;

import net.moewes.cloud.ui.UiComponent;

/**
 * Java wrapper for Vaadin web component vaadin-form-layout
 */
public class FormLayout extends UiComponent {

    /**
     * default constructor
     */
    public FormLayout() {
        super("div");
    }

    /**
     * @param inputComponent input ui component
     * @param labelComponent label ui component
     */
    public void addFormItem(UiComponent inputComponent, UiComponent labelComponent) {
        UiComponent formItem = new UiComponent("div");
        formItem.getElement().setAttribute("style", "display: flex;justify-content: flex-end; padding: .5em;");
        labelComponent.getElement().setAttribute("style", "padding: .5em 1em .5em 0; flex: 1; text-align: right;");
        inputComponent.getElement().setAttribute("style", "flex: 2; padding: .5em");
        formItem.add(labelComponent, inputComponent);
        add(formItem);
    }

}
