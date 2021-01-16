package com.tutorial.techinicaltest.ProfileModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {

@SerializedName("postLists")
@Expose
private List<PostList> postLists = null;
@SerializedName("paginationInfo")
@Expose
private PaginationInfo paginationInfo;

public List<PostList> getPostLists() {
return postLists;
}

public void setPostLists(List<PostList> postLists) {
this.postLists = postLists;
}

public PaginationInfo getPaginationInfo() {
return paginationInfo;
}

public void setPaginationInfo(PaginationInfo paginationInfo) {
this.paginationInfo = paginationInfo;
}

}