package com.example.vinneytoy.constant;

public enum RoleEnum {
    ADMIN("ADMIN"),
    ANONYMOUS("ANONYMOUS"),
    USER("USER");

    private String value;

    RoleEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


}
