package net.moewes.cloudui.vaadin;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.moewes.cloudui.UiComponent;
import net.moewes.cloudui.UiElement;
import net.moewes.cloudui.UiPropertyArray;
import net.moewes.cloudui.UiPropertyObject;

/**
 * Java wrapper for Vaadin web component vaadin-form-layout
 */
public class FormLayout extends UiComponent {

    UiPropertyArray resposiveSteps = new UiPropertyArray();

    /**
     * default constructor
     */
    public FormLayout() {
        super("vaadin-form-layout");
    }


    /**
     * adds a new form item to the form layout
     *
     * @param inputComponent input ui component
     * @param labelComponent label ui component
     */
    public void addFormItem(UiComponent inputComponent, UiComponent labelComponent) {
        UiComponent formItem = new UiComponent("vaadin-form-item");
        formItem.add(labelComponent, inputComponent);
        labelComponent.getElement().setAttribute("slot", "label");
        add(formItem);
    }

    /**
     * adds a new responsive step to the form layout
     *
     * @param minWidth
     * @param colunms
     * @param labelPosition
     */
    public void addResponsiveStep(String minWidth, int colunms, LabelPosition labelPosition) {

        UiPropertyObject propertyObject = new UiPropertyObject();
        propertyObject.put("minWidth", "\"" + minWidth + "\"");
        propertyObject.put("columns", "" + colunms);
        propertyObject.put("labelsPosition", "\"" + labelPosition.getText() + "\"");

        resposiveSteps.add(propertyObject);
    }

    @Override
    public UiElement render() {

        if (!resposiveSteps.isEmpty()) {
            getElement().setProperty("responsiveSteps", resposiveSteps.toJson());
        }
        return super.render();
    }

    /**
     * possible values for label posititons in responsive steps
     */
    @AllArgsConstructor
    @Getter
    public enum LabelPosition {
        TOP("top"),
        ASIDE("aside");

        private final String text;
    }
}
