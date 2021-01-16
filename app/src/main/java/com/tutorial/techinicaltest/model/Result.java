package com.tutorial.techinicaltest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

@SerializedName("profileDetails")
@Expose
private ProfileDetails profileDetails;

public ProfileDetails getProfileDetails() {
return profileDetails;
}

public void setProfileDetails(ProfileDetails profileDetails) {
this.profileDetails = profileDetails;
}

}