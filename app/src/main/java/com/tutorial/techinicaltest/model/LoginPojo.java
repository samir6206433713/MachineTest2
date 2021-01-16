package com.tutorial.techinicaltest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginPojo {

@SerializedName("serverResponse")
@Expose
private ServerResponse serverResponse;
@SerializedName("result")
@Expose
private Result result;

public ServerResponse getServerResponse() {
return serverResponse;
}

public void setServerResponse(ServerResponse serverResponse) {
this.serverResponse = serverResponse;
}

public Result getResult() {
return result;
}

public void setResult(Result result) {
this.result = result;
}

}