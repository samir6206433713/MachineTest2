package com.tutorial.techinicaltest.ProfileModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LikeInfo {

@SerializedName("totalLike")
@Expose
private Integer totalLike;
@SerializedName("isLike")
@Expose
private Boolean isLike;

public Integer getTotalLike() {
return totalLike;
}

public void setTotalLike(Integer totalLike) {
this.totalLike = totalLike;
}

public Boolean getIsLike() {
return isLike;
}

public void setIsLike(Boolean isLike) {
this.isLike = isLike;
}

}