package net.moewes.cloudui.vaadin;

import java.util.function.Consumer;

import net.moewes.cloudui.UiComponent;
import net.moewes.cloudui.UiEvent;

/**
 * CloudUi representation of Vaadin Button
 */
public class Button extends UiComponent {

    public Button() {
        super("vaadin-button");
    }

    public Button(String text) {
        this();
        setText(text);
    }

    public Button(String text, Consumer<UiEvent> handler) {
        this();
        setText(text);
        addEventListener("click", handler);
    }

    public Button(UiComponent icon) {
        this();
        setIcon(icon);
    }

    public Button(UiComponent icon, Consumer<UiEvent> handler) {
        this();
        setIcon(icon);
        addEventListener("click", handler);
    }

    public Button(String text, UiComponent icon) {
        this();
        setText(text);
        setIcon(icon);
    }

    public Button(String text, UiComponent icon, Consumer<UiEvent> handler) {
        this();
        setText(text);
        setIcon(icon);
        addEventListener("click", handler);
    }

    public void setText(String text) {
        getElement().setInnerHtml(text);
    }

    public void setIcon(UiComponent icon) {
        // TODO
    }

}
