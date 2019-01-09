package com.example.demo.entity;

/**
 * Created by Ilyas on 09.01.2019.
 */
public enum Code {
    OK("00.Result.Ok"),
    NOT_FOUND("01.Result.NotFound"),
    ERROR("02.Result.Error");

    private String internalVal;

    Code(String Val) {
        this.internalVal = Val;
    }

    public String getUrl() {
        return internalVal;
    }
}
