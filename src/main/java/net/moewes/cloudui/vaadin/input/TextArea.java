package net.moewes.cloudui.vaadin.input;

import java.util.Optional;

import net.moewes.cloudui.UiElement;

/**
 * Java wrapper for Vaadin web cmponent vaadin-text-area
 */
public class TextArea extends InputField {

    private String minHeight;
    private String maxHeight;

    /**
     * default constructor
     */
    public TextArea() {
        super("vaadin-text-area");
    }

    /**
     * sets the minimal height
     *
     * @param minHeight minimal height as css value e.g. 100px
     */
    public void setMinHeight(String minHeight) {

        this.minHeight = minHeight;
    }

    /**
     * sets the maximal height
     *
     * @param maxHeight maximal height ass css value e.g. 100px
     */
    public void setMaxHeight(String maxHeight) {

        this.maxHeight = maxHeight;
    }

    @Override
    public UiElement render() {

        getStyle().ifPresent(style -> getElement().setAttribute("style", style));
        return super.render();
    }

    private Optional<String> getStyle() {
        if (minHeight == null && maxHeight == null) {
            return Optional.empty();
        } else {
            String result = "";
            if (minHeight != null) {
                result = result + "min-height: " + minHeight + ";";
            }
            if (maxHeight != null) {
                result = result + "max-height: " + maxHeight + ";";
            }
            return Optional.of(result);
        }
    }
}
