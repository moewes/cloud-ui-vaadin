package net.moewes.cloudui.vaadin;

import java.util.function.Consumer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import net.moewes.cloudui.UiComponent;
import net.moewes.cloudui.UiElement;
import net.moewes.cloudui.UiEvent;

/**
 * CloudUi representation of Vaadin Button
 */
@Setter
public class Button extends UiComponent {

    private Type type = Type.SECONDARY;
    private Color color = Color.NORMAL;
    private Size size = Size.NORMAL;

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

    public void setText(String text) {
        getElement().setInnerHtml(text);
    }

    public void setIcon(UiComponent icon, IconPlacement placement) {
        icon.getElement().setAttribute("slot", placement.getSlot());
        add(icon);
    }

    public void addClickListener(Consumer<UiEvent> function) {
        addEventListener("click",function);
    }

    @Override
    public UiElement render() {
        String theme = type.getAttributeText() + " " + size.getAttributeText() + " " + color.getAttributeText();
        getElement().setAttribute("theme", theme);
        return super.render();
    }

    @AllArgsConstructor
    @Getter
    public enum IconPlacement {
        PREFIX("prefix"),
        SUFFIX("suffix");

        private final String slot;
    }

    @AllArgsConstructor
    @Getter
    public enum Type {
        PRIMARY("primary"),
        SECONDARY("secondary"),
        TERTIARY("tertiary");

        private final String attributeText;
    }

    @AllArgsConstructor
    @Getter
    public enum Color {
        NORMAL(""),
        CONSTRAST("contrast"),
        SUCCESS("success"),
        ERROR("error");

        private final String attributeText;
    }

    @AllArgsConstructor
    @Getter
    public enum Size {
        NORMAL(""),
        SMALL("small"),
        LARGE("large");

        private final String attributeText;
    }
}
