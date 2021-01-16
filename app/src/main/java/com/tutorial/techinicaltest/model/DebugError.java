package com.tutorial.techinicaltest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DebugError {

    @SerializedName("field")
    @Expose
    private String field;
    @SerializedName("message")
    @Expose
    private String message;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
