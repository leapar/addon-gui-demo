package com.company.addonguidemo.web.gui.components;

import com.company.addonguidemo.gui.components.BaiduMap;
import com.haulmont.cuba.web.gui.components.WebAbstractComponent;

public class WebBaiduMap extends WebAbstractComponent<com.company.addonguidemo.web.toolkit.ui.baidumap.BaiduMap> implements BaiduMap {
    public WebBaiduMap() {
        this.component = new com.company.addonguidemo.web.toolkit.ui.baidumap.BaiduMap();
    }

    @Override
    public void setLat(Double lat) {
        this.component.setLat(lat);
    }

    @Override
    public void setLng(Double lng) {
        this.component.setLng(lng);
    }

    @Override
    public void setZoom(Integer zoom) {
        this.component.setZoom(zoom);
    }

    @Override
    public Double getLat() {
        return this.component.getLat();
    }

    @Override
    public Double getLng() {
        return this.component.getLng();
    }

    @Override
    public Integer getZoom() {
        return this.component.getZoom();
    }




}