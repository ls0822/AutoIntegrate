package com.rongcloud.integrate.model;

public enum  ModelType {
    Lib("lib"),
    Kit("kit"),
    Push("push"),
    Sight("sight");

    String name;
    ModelType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
