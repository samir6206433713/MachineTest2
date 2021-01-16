package com.tutorial.techinicaltest.network;


import com.tutorial.techinicaltest.ProfileModel.ProfileView;
import com.tutorial.techinicaltest.model.LoginPojo;
import com.tutorial.techinicaltest.model.SignUpResponse;

import java.util.Map;


import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.HeaderMap;
import retrofit2.http.Multipart;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {


    @POST("action.php")
    Call<LoginPojo> getSignInResult(
            @Body RequestBody body);


    @POST("action.php")
    Call<ProfileView> profileview(@HeaderMap Map<String, String> map,
                                  @Body RequestBody body);

}