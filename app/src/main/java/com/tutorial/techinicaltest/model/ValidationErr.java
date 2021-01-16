package com.tutorial.techinicaltest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ValidationErr {

    @SerializedName("debug_error")
    @Expose
    private DebugError debugError;
    @SerializedName("message")
    @Expose
    private String message;

    public DebugError getDebugError() {
        return debugError;
    }

    public void setDebugError(DebugError debugError) {
        this.debugError = debugError;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}