package com.tutorial.techinicaltest.ProfileModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageList {

@SerializedName("imageID")
@Expose
private String imageID;
@SerializedName("imageUrl")
@Expose
private String imageUrl;

public String getImageID() {
return imageID;
}

public void setImageID(String imageID) {
this.imageID = imageID;
}

public String getImageUrl() {
return imageUrl;
}

public void setImageUrl(String imageUrl) {
this.imageUrl = imageUrl;
}

}