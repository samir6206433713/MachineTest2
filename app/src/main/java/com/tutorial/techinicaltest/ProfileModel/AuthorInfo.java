package com.tutorial.techinicaltest.ProfileModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AuthorInfo {

@SerializedName("fullName")
@Expose
private String fullName;
@SerializedName("firstName")
@Expose
private String firstName;
@SerializedName("lastName")
@Expose
private String lastName;
@SerializedName("email")
@Expose
private String email;
@SerializedName("userName")
@Expose
private String userName;
@SerializedName("phoneCountryCode")
@Expose
private String phoneCountryCode;
@SerializedName("phone")
@Expose
private String phone;
@SerializedName("statusText")
@Expose
private String statusText;
@SerializedName("signupType")
@Expose
private String signupType;
@SerializedName("isFirstTime")
@Expose
private String isFirstTime;
@SerializedName("accessToken")
@Expose
private String accessToken;
@SerializedName("encryptedUserId")
@Expose
private String encryptedUserId;
@SerializedName("rtmToken")
@Expose
private String rtmToken;
@SerializedName("remoteNumber")
@Expose
private String remoteNumber;
@SerializedName("friendsId")
@Expose
private String friendsId;
@SerializedName("emailVerifiedStatus")
@Expose
private String emailVerifiedStatus;
@SerializedName("otp")
@Expose
private String otp;
@SerializedName("imgUrl")
@Expose
private String imgUrl;
@SerializedName("followers")
@Expose
private String followers;
@SerializedName("following")
@Expose
private String following;
@SerializedName("userPostCount")
@Expose
private Integer userPostCount;
@SerializedName("userImagePostCount")
@Expose
private Integer userImagePostCount;
@SerializedName("userVideoPostCount")
@Expose
private Integer userVideoPostCount;

public String getFullName() {
return fullName;
}

public void setFullName(String fullName) {
this.fullName = fullName;
}

public String getFirstName() {
return firstName;
}

public void setFirstName(String firstName) {
this.firstName = firstName;
}

public String getLastName() {
return lastName;
}

public void setLastName(String lastName) {
this.lastName = lastName;
}

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

public String getUserName() {
return userName;
}

public void setUserName(String userName) {
this.userName = userName;
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

public String getStatusText() {
return statusText;
}

public void setStatusText(String statusText) {
this.statusText = statusText;
}

public String getSignupType() {
return signupType;
}

public void setSignupType(String signupType) {
this.signupType = signupType;
}

public String getIsFirstTime() {
return isFirstTime;
}

public void setIsFirstTime(String isFirstTime) {
this.isFirstTime = isFirstTime;
}

public String getAccessToken() {
return accessToken;
}

public void setAccessToken(String accessToken) {
this.accessToken = accessToken;
}

public String getEncryptedUserId() {
return encryptedUserId;
}

public void setEncryptedUserId(String encryptedUserId) {
this.encryptedUserId = encryptedUserId;
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

public String getFriendsId() {
return friendsId;
}

public void setFriendsId(String friendsId) {
this.friendsId = friendsId;
}

public String getEmailVerifiedStatus() {
return emailVerifiedStatus;
}

public void setEmailVerifiedStatus(String emailVerifiedStatus) {
this.emailVerifiedStatus = emailVerifiedStatus;
}

public String getOtp() {
return otp;
}

public void setOtp(String otp) {
this.otp = otp;
}

public String getImgUrl() {
return imgUrl;
}

public void setImgUrl(String imgUrl) {
this.imgUrl = imgUrl;
}

public String getFollowers() {
return followers;
}

public void setFollowers(String followers) {
this.followers = followers;
}

public String getFollowing() {
return following;
}

public void setFollowing(String following) {
this.following = following;
}

public Integer getUserPostCount() {
return userPostCount;
}

public void setUserPostCount(Integer userPostCount) {
this.userPostCount = userPostCount;
}

public Integer getUserImagePostCount() {
return userImagePostCount;
}

public void setUserImagePostCount(Integer userImagePostCount) {
this.userImagePostCount = userImagePostCount;
}

public Integer getUserVideoPostCount() {
return userVideoPostCount;
}

public void setUserVideoPostCount(Integer userVideoPostCount) {
this.userVideoPostCount = userVideoPostCount;
}

}