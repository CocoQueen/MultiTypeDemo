package com.coco.multitypedemo;

/**
 * Created by ydx on 18-6-19.
 */

public class Three implements Visitable {
    String text;

    public Three(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    @Override
    public int type(TypeFactory typeFactory) {
        return typeFactory.type(this);
    }
}
