package net.moewes.cloudui.vaadin;

import lombok.Getter;
import net.moewes.cloud.ui.UiComponent;

@Getter
public class TextField extends UiComponent {

    private String placeholder;
    private String label;
    private boolean required;

    public TextField() {
        super("vaadin-text-field");
        getElement().setHasInput(true);
    }

    public void setLabel(String label) {
        this.label = label;
        getElement().setAttribute("label", label);
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
        getElement().setAttribute("placeholder", placeholder);
    }

    public void setRequired(boolean required) {
        this.required = required;
        getElement().setAttribute("required", null);
    }
}
