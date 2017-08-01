package com.company.addonguidemo.gui.xml.layout.loaders;

import com.company.addonguidemo.gui.components.BaiduMap;
import com.haulmont.cuba.gui.xml.layout.loaders.AbstractComponentLoader;

public class BaiduMapLoader extends AbstractComponentLoader<BaiduMap> {
    @Override
    public void createComponent() {
        resultComponent = factory.createComponent(BaiduMap.class);
        loadId(resultComponent, element);
    }

    @Override
    public void loadComponent() {

        String zoom = element.attributeValue("zoom");
        if (zoom != null) {
            resultComponent.setZoom(Integer.valueOf(zoom));
        }
        String lat = element.attributeValue("lat");
        if (lat != null) {
            resultComponent.setLat(Double.valueOf(lat));
        }
        String lng = element.attributeValue("lng");
        if (lng != null) {
            resultComponent.setLng(Double.valueOf(lng));
        }

        assignXmlDescriptor(resultComponent, element);


        boolean enabled = loadEnable(resultComponent, element);
        boolean visible = loadVisible(resultComponent, element);

        loadStyleName(resultComponent, element);



        loadWidth(resultComponent, element);
        loadHeight(resultComponent, element);
        loadAlign(resultComponent, element);

    }
}
