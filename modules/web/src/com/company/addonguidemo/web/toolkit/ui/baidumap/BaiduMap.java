package com.company.addonguidemo.web.toolkit.ui.baidumap;

import com.vaadin.annotations.StyleSheet;
import com.vaadin.ui.AbstractJavaScriptComponent;
import com.vaadin.annotations.JavaScript;
import elemental.json.JsonObject;

@JavaScript({"baidumap-connector.js", "jquery-ui.js", "http://api.map.baidu.com/getscript?v=2.0&ak=ev8KAaHPxMsFZEpGv0pTWz4D7KFUVLSq&services=&t=20170728132058"})
@StyleSheet({"jquery-ui.css"})
public class BaiduMap extends AbstractJavaScriptComponent {
    public BaiduMap() {
        addFunction("valueChanged", arguments -> {
            /*JsonArray array = arguments.getNumber(0);
            double[] values = new double[2];
            values[0] = array.getNumber(0);
            values[1] = array.getNumber(1);
            listener.valueChanged(values);*/
            JsonObject object = arguments.getObject(0);

            this.setAddress(object.getString("address"));
            this.setProvince(object.getString("province"));
            this.setDistrict(object.getString("district"));
            this.setLat(object.getObject("point").getNumber("lat"));
            this.setLng(object.getObject("point").getNumber("lng"));
            //System.console().writer().println("sssss");
        });
    }

    @Override
    protected BaiduMapState getState() {
        return (BaiduMapState) super.getState();
    }

    public double getLat() {
        return this.getState().lat;
    }

    public void setLat(double lat) {
        this.getState().lat = lat;
    }

    public double getLng() {
        return this.getState().lng;
    }

    public void setLng(double lng) {
        this.getState().lng = lng;
    }

    public void setZoom(int zoom) {
        this.getState().zoom = zoom;
    }

    public  int getZoom() {
        return this.getState().zoom;
    }

    public String getProvince() {
        return this.getState().province;
    }

    public void setProvince(String province) {
        this.getState().province = province;
    }

    public String getDistrict() {
        return this.getState().district;
    }

    public void setDistrict(String district) {
        this.getState().district = district;
    }

    public String getAddress() {
        return this.getState().address;
    }

    public void setAddress(String address) {
        this.getState().address = address;
    }
}