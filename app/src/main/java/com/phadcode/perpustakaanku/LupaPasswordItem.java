package com.phadcode.perpustakaanku;

/**
 * Created by APEX on 24/03/2018.
 */

public class LupaPasswordItem  {
    private int icon;
    private String text;

    public LupaPasswordItem(int icon, String text) {
        this.icon = icon;
        this.text = text;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}



