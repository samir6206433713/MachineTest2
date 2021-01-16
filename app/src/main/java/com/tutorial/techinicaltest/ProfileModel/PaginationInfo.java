package com.tutorial.techinicaltest.ProfileModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PaginationInfo {

@SerializedName("pageNo")
@Expose
private Integer pageNo;
@SerializedName("totalPosts")
@Expose
private Integer totalPosts;
@SerializedName("postPerPage")
@Expose
private Integer postPerPage;

public Integer getPageNo() {
return pageNo;
}

public void setPageNo(Integer pageNo) {
this.pageNo = pageNo;
}

public Integer getTotalPosts() {
return totalPosts;
}

public void setTotalPosts(Integer totalPosts) {
this.totalPosts = totalPosts;
}

public Integer getPostPerPage() {
return postPerPage;
}

public void setPostPerPage(Integer postPerPage) {
this.postPerPage = postPerPage;
}

}