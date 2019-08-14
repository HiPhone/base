package org.hiphone.adapter;

/**
 * 类适配类
 */
public class ClassAdapter extends Adaptee implements Target {

    @Override
    public void request() {
        specificRequest();
    }
}
