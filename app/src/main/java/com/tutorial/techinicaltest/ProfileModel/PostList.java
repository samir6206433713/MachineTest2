package com.tutorial.techinicaltest.ProfileModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PostList {

@SerializedName("postID")
@Expose
private String postID;
@SerializedName("postDate")
@Expose
private String postDate;
@SerializedName("postDescription")
@Expose
private String postDescription;
@SerializedName("authorInfo")
@Expose
private AuthorInfo authorInfo;
@SerializedName("isOwnPost")
@Expose
private Boolean isOwnPost;
@SerializedName("imageLists")
@Expose
private List<ImageList> imageLists = null;
@SerializedName("postMediaType")
@Expose
private String postMediaType;
@SerializedName("imageCount")
@Expose
private Integer imageCount;
@SerializedName("videoLists")
@Expose
private List<Object> videoLists = null;
@SerializedName("hashTagLists")
@Expose
private List<Object> hashTagLists = null;
@SerializedName("tagFriends")
@Expose
private List<Object> tagFriends = null;
@SerializedName("likeInfo")
@Expose
private LikeInfo likeInfo;
@SerializedName("totalComments")
@Expose
private Integer totalComments;
@SerializedName("shareUrl")
@Expose
private String shareUrl;

public String getPostID() {
return postID;
}

public void setPostID(String postID) {
this.postID = postID;
}

public String getPostDate() {
return postDate;
}

public void setPostDate(String postDate) {
this.postDate = postDate;
}

public String getPostDescription() {
return postDescription;
}

public void setPostDescription(String postDescription) {
this.postDescription = postDescription;
}

public AuthorInfo getAuthorInfo() {
return authorInfo;
}

public void setAuthorInfo(AuthorInfo authorInfo) {
this.authorInfo = authorInfo;
}

public Boolean getIsOwnPost() {
return isOwnPost;
}

public void setIsOwnPost(Boolean isOwnPost) {
this.isOwnPost = isOwnPost;
}

public List<ImageList> getImageLists() {
return imageLists;
}

public void setImageLists(List<ImageList> imageLists) {
this.imageLists = imageLists;
}

public String getPostMediaType() {
return postMediaType;
}

public void setPostMediaType(String postMediaType) {
this.postMediaType = postMediaType;
}

public Integer getImageCount() {
return imageCount;
}

public void setImageCount(Integer imageCount) {
this.imageCount = imageCount;
}

public List<Object> getVideoLists() {
return videoLists;
}

public void setVideoLists(List<Object> videoLists) {
this.videoLists = videoLists;
}

public List<Object> getHashTagLists() {
return hashTagLists;
}

public void setHashTagLists(List<Object> hashTagLists) {
this.hashTagLists = hashTagLists;
}

public List<Object> getTagFriends() {
return tagFriends;
}

public void setTagFriends(List<Object> tagFriends) {
this.tagFriends = tagFriends;
}

public LikeInfo getLikeInfo() {
return likeInfo;
}

public void setLikeInfo(LikeInfo likeInfo) {
this.likeInfo = likeInfo;
}

public Integer getTotalComments() {
return totalComments;
}

public void setTotalComments(Integer totalComments) {
this.totalComments = totalComments;
}

public String getShareUrl() {
return shareUrl;
}

public void setShareUrl(String shareUrl) {
this.shareUrl = shareUrl;
}

}


