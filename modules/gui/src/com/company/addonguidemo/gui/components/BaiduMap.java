package com.company.addonguidemo.gui.components;

import com.haulmont.cuba.gui.components.Component;

public interface BaiduMap extends Component {
    String NAME = "baidumap";

    void setLat(Double lat);
    void setLng(Double lng);
    void setZoom(Integer zoom);

    Double getLat();
    Double getLng();
    Integer getZoom();
}