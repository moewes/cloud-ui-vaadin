package net.moewes.cloudui.vaadin.input;

import lombok.Setter;
import net.moewes.cloudui.UiComponent;
import net.moewes.cloudui.UiElement;

@Setter
public abstract class InputField extends UiComponent {

    private boolean required;
    private boolean disabled;
    private boolean readonly;
    private boolean preventInvalidInput;
    private boolean autoselect;
    private boolean clearButtonVisible;
    private boolean invalid;

    protected InputField(String tag) {
        super(tag);
        getElement().setHasInput(true);
    }

    public void setLabel(String label) {
        getElement().setAttribute("label", label);
    }

    public void setPlaceholder(String placeholder) {
        getElement().setAttribute("placeholder", placeholder);
    }

    public void setErrorMessage(String message) {
        getElement().setAttribute("error-message", message);
    }

    public void setMinlength(int minlength) {
        getElement()
                .setAttribute("minlength", "" + minlength);
    }

    public void setMaxlength(int maxlength) {
        getElement()
                .setAttribute("maxlength", "" + maxlength);
    }

    /**
     * adds a suffix component to the field
     *
     * @param component component
     */
    public void addSuffix(UiComponent component) {
        component.getElement().setAttribute("slot", "suffix");
        add(component);
    }

    /**
     * adds a prefix component to the field
     *
     * @param component component
     */
    public void addPrefix(UiComponent component) {
        component.getElement().setAttribute("slot", "prefix");
        add(component);
    }

    /**
     * sets a pattern of valid input
     *
     * @param pattern
     */
    public void setPattern(String pattern) {
        getElement().setAttribute("pattern", pattern);
    }

    @Override
    public UiElement render() {
        if (required) {
            getElement().setAttribute("required", "true");
        }
        if (disabled) {
            getElement().setAttribute("disabled", "true");
        }
        if (preventInvalidInput) {
            getElement().setAttribute("prevent-invalid-input", "true");
        }
        if (autoselect) {
            getElement().setAttribute("autoselect", "true");
        }
        if (clearButtonVisible) {
            getElement().setAttribute("clear-button-visible", "true");
        }
        if (readonly) {
            getElement().setAttribute("readonly", "true");
        }
        if (invalid) {
            getElement().setAttribute("invalid", "true");
        }
        return super.render();
    }

    // TODO
    // Theme variants
}
