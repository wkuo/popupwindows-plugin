package com.atex.plugins.popupwindows;

import com.polopoly.cm.client.CMException;
import com.polopoly.model.ModelTypeDescription;
import com.polopoly.siteengine.standard.content.ContentBasePolicy;

public class PopupWindowsElementPolicy extends ContentBasePolicy implements ModelTypeDescription {

    public String getBgColor() {
        return getChildValue("bgColor");
    }

    public void setBgColor(String value) throws CMException {
        setComponent("bgColor", value);
    }

    public String getMaskColor() {
        return getChildValue("maskColor");
    }

    public void setMaskColor(String value) throws CMException {
        setComponent("maskColor", value);
    }

    public void setSplash(String value) throws CMException {
        setComponent("splash", value);
    }

    public String getSplash() {
        return getChildValue("splash");
    }
}
