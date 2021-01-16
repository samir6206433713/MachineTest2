package com.tutorial.techinicaltest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProfileDetails {

@SerializedName("accessToken")
@Expose
private String accessToken;
@SerializedName("fullName")
@Expose
private String fullName;
@SerializedName("userName")
@Expose
private String userName;
@SerializedName("email")
@Expose
private String email;
@SerializedName("profileImageURL")
@Expose
private String profileImageURL;
@SerializedName("encryptedUserId")
@Expose
private String encryptedUserId;
@SerializedName("phoneCountryCode")
@Expose
private String phoneCountryCode;
@SerializedName("phone")
@Expose
private String phone;
@SerializedName("isFirstTime")
@Expose
private String isFirstTime;
@SerializedName("signupType")
@Expose
private String signupType;
@SerializedName("statusText")
@Expose
private String statusText;
@SerializedName("rtmToken")
@Expose
private String rtmToken;
@SerializedName("remoteNumber")
@Expose
private String remoteNumber;

public String getAccessToken() {
return accessToken;
}

public void setAccessToken(String accessToken) {
this.accessToken = accessToken;
}

public String getFullName() {
return fullName;
}

public void setFullName(String fullName) {
this.fullName = fullName;
}

public String getUserName() {
return userName;
}

public void setUserName(String userName) {
this.userName = userName;
}

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

public String getProfileImageURL() {
return profileImageURL;
}

public void setProfileImageURL(String profileImageURL) {
this.profileImageURL = profileImageURL;
}

public String getEncryptedUserId() {
return encryptedUserId;
}

public void setEncryptedUserId(String encryptedUserId) {
this.encryptedUserId = encryptedUserId;
}

public String getPhoneCountryCode() {
return phoneCountryCode;
}

public void setPhoneCountryCode(String phoneCountryCode) {
this.phoneCountryCode = phoneCountryCode;
}

public String getPhone() {
return phone;
}

public void setPhone(String phone) {
this.phone = phone;
}

public String getIsFirstTime() {
return isFirstTime;
}

public void setIsFirstTime(String isFirstTime) {
this.isFirstTime = isFirstTime;
}

public String getSignupType() {
return signupType;
}

public void setSignupType(String signupType) {
this.signupType = signupType;
}

public String getStatusText() {
return statusText;
}

public void setStatusText(String statusText) {
this.statusText = statusText;
}

public String getRtmToken() {
return rtmToken;
}

public void setRtmToken(String rtmToken) {
this.rtmToken = rtmToken;
}

public String getRemoteNumber() {
return remoteNumber;
}

public void setRemoteNumber(String remoteNumber) {
this.remoteNumber = remoteNumber;
}

}