package net.moewes.cloudui.vaadin.input;

import net.moewes.cloudui.UiElement;

public abstract class NumberInputField extends InputField {

    private boolean hasControls;

    public NumberInputField(String tag) {
        super(tag);
    }

    public void setMinValue(Number minValue) {
        getElement().setAttribute("min", "" + minValue);
    }

    public void setMaxValue(Number maxValue) {
        getElement().setAttribute("max", "" + maxValue);
    }

    public void setStep(Number step) {
        getElement().setAttribute("step", "" + step);
    }

    public void setHasControls(boolean hasControls) {
        this.hasControls = hasControls;
    }

    @Override
    public UiElement render() {
        if (hasControls) {
            getElement().setAttribute("has-controls", "true");
        }
        return super.render();
    }
}
