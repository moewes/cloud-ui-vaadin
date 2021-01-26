package net.moewes.cloudui.vaadin;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.moewes.cloudui.UiComponent;
import net.moewes.cloudui.UiElement;
import net.moewes.cloudui.html.Div;

/**
 * Java wrapper for Vaadin web component vaadin-detail
 */
public class Details extends UiComponent {

    private boolean opened = true;

    /**
     * default constructor
     *
     * @param headerText text that is displayed in the header
     */
    public Details(String headerText) {
        super("vaadin-details");
        Div header = new Div();
        header.setInnerHtml(headerText);
        header.getElement().setAttribute("slot", "summary");
        add(header);
    }

    /**
     * sets the theme attribute of vaadin-detail
     *
     * @param theme theme
     */
    public void setTheme(Themes theme) {
        getElement().setAttribute("theme", theme.getAttributeText());
    }

    /**
     * sets the opened attribute of vaadin-detail. default value is true opened
     *
     * @param opened true or false
     */
    public void setOpened(boolean opened) {
        this.opened = opened;
    }

    @Override
    public UiElement render() {
        if (opened) {
            getElement().setAttribute("opened", "true");
        }
        return super.render();
    }

    /**
     * possible values for theme attribute
     */
    @AllArgsConstructor
    @Getter
    public enum Themes {
        REVERSE("reverse"),
        FILLED("filled"),
        SMALL("small"),
        SMALL_FILLED("small filled"),
        SMALL_REVERSE("small reverse"),
        SMALL_FILLED_REVERSE("small filled reverse"),
        REVERSE_FILLED("reverse filled");

        private final String attributeText;
    }
}
