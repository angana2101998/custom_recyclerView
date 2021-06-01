package com.example.rv_custom.models;

public class item {
    private int type;
    private Object object;

    public item(int type, Object object) {
        this.type = type;
        this.object = object;
    }

    public int getType() {
        return type;
    }



    public Object getObject() {
        return object;
    }


}
