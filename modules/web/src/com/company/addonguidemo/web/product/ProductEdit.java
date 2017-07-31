package com.company.addonguidemo.web.product;

import com.company.addonguidemo.web.toolkit.ui.slider.SliderServerComponent;
import com.haulmont.cuba.gui.components.*;
import com.company.addonguidemo.entity.Product;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.haulmont.cuba.gui.components.FieldGroup;
import com.haulmont.cuba.gui.xml.layout.ComponentsFactory;
import com.haulmont.cuba.web.gui.components.WebComponentsHelper;
import com.vaadin.ui.Layout;
import javax.inject.Inject;

public class ProductEdit extends AbstractEditor<Product> {


    @Inject
    private FieldGroup fieldGroup;
    @Inject
    private ComponentsFactory componentsFactory;

    @Override
    protected void initNewItem(Product item) {
        super.initNewItem(item);
        item.setMinDiscount(15.0);
        item.setMaxDiscount(70.0);
    }

    @Override
    protected void postInit() {
        super.postInit();


        Component box = componentsFactory.createComponent(VBoxLayout.class);
        Layout vBox = (Layout) WebComponentsHelper.unwrap(box);
        SliderServerComponent slider = new SliderServerComponent();
       /* slider.setValue(new double[] {getItem().getMinDiscount(), getItem().getMaxDiscount()});
        slider.setMinValue(0);
        slider.setMaxValue(100);
        slider.setWidth("240px");
        slider.setListener(newValue -> {
            getItem().setMinDiscount(newValue[0]);
            getItem().setMaxDiscount(newValue[1]);
        });*/
        vBox.addComponent(slider);


        /*FieldGroup.FieldConfig fcName = fieldGroup.createField("slider");
        fcName.setProperty("slider");
        fcName.setEditable(false);
        fcName.setComponent(box);
        fieldGroup.addField(fcName);*/

        FieldGroup.FieldConfig sliderCol = fieldGroup.getField("slider");
        sliderCol.setComponent(box);

/*
        fieldGroup.addCustomField("slider", (datasource, propertyId) -> {
            Component box = componentsFactory.createComponent(VBoxLayout.class);
            Layout vBox = (Layout) WebComponentsHelper.unwrap(box);
            SliderServerComponent slider = new SliderServerComponent();
            slider.setValue(new double[] {getItem().getMinDiscount(), getItem().getMaxDiscount()});
            slider.setMinValue(0);
            slider.setMaxValue(100);
            slider.setWidth("240px");
            slider.setListener(newValue -> {
                getItem().setMinDiscount(newValue[0]);
                getItem().setMaxDiscount(newValue[1]);
            });
            vBox.addComponent(slider);
            return box;
        });
*/
    }
}