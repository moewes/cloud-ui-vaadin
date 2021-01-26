package net.moewes.cloudui.vaadin.input;

import net.moewes.cloudui.UiElement;

/**
 * Java wrapper for Vaadin web component vaadin-password-field
 */
public class PasswordField extends InputField {

    private boolean hideRevealButton;

    /**
     * default constructor
     */
    public PasswordField() {
        super("vaadin-password-field");
    }

    /**
     * sets the reveal-button-hidden attribute of vaadin-password-field
     *
     * @param hideRevealButton if true reveal button is hidden
     */
    public void hideRevealButton(boolean hideRevealButton) {
        this.hideRevealButton = hideRevealButton;
    }

    @Override
    public UiElement render() {
        if (hideRevealButton) {
            getElement().setAttribute("reveal-button-hidden", "true");
        }
        return super.render();
    }
}
