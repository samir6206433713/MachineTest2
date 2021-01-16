package com.tutorial.techinicaltest.presenter;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tutorial.techinicaltest.ProfileModel.ProfileView;
import com.tutorial.techinicaltest.model.ErrorData;
import com.tutorial.techinicaltest.model.LoginPojo;
import com.tutorial.techinicaltest.network.ApiInterface;
import com.tutorial.techinicaltest.network.Apiclient;
import com.tutorial.techinicaltest.view.MyListData;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;

public class ProfilePresenter {

    MyListData[] myListData;
    ProfilePresenterView profilePresenterView;
    private Context context;




    public ProfilePresenter(ProfilePresenterView profilePresenterView){
        this.profilePresenterView = profilePresenterView;

    }



    public void retrofitProfile(String accessToken,String action,String pageNo,String timeZone)
    {

        Map<String,String> map = new HashMap<>();
        //map.put("Content-Type","application/json");
        map.put("ACCESSTOKEN", accessToken);

        MediaType mediaType = MediaType.parse("application/json");

        JSONObject obj = new JSONObject();
        try {
            obj.put("action",action);
            obj.put("pageNo",pageNo);
            obj.put("timeZone",timeZone);
            Log.i("SignUpPresenterBody",obj.toString());

        } catch (JSONException e) {
            e.printStackTrace();
        }



        Log.i("SignUpPresenterBody",""+obj.toString());
        RequestBody body = RequestBody.create(mediaType,obj.toString());

        ApiInterface apiService =
                Apiclient.getClient().create(ApiInterface.class);

        Call<ProfileView> call = (Call<ProfileView>) apiService.profileview(map,body);
        call.enqueue(new Callback<ProfileView>() {
            @Override
            public void onResponse(Call<ProfileView> call, retrofit2.Response<ProfileView> response) {
                ArrayList<String> name=new ArrayList<String>();
                ArrayList<String> description=new ArrayList<String>();;
                ArrayList<String> image=new ArrayList<String>();;


                if (response.code() == 200){


                    Log.i("resoponsecode",String.valueOf(response.code()));
                    Log.i("getImageUrl", response.body().getResult().getPostLists().get(0).getImageLists().get(0).getImageUrl());
                    Log.i("getPostDescription",String.valueOf(response.body().getResult().getPostLists().get(0).getPostDescription()));
                    Log.i("getFullName",String.valueOf(response.body().getResult().getPostLists().get(0).getAuthorInfo().getFullName()));
                    Log.i("resoponsecodesize", String.valueOf(response.body().getResult().getPostLists().size()));

                   ;

                      int arrySize=  response.body().getResult().getPostLists().size();








                     for(int i=0;i<arrySize;i++){


                        // String responseCode =String.valueOf(response.code());
                         String getImageUrl=response.body().getResult().getPostLists().get(i).getImageLists().get(0).getImageUrl();
                         String getPostDescription=String.valueOf(response.body().getResult().getPostLists().get(i).getPostDescription());
                         String getFullName=String.valueOf(response.body().getResult().getPostLists().get(i).getAuthorInfo().getFullName());


                         Log.i("resoponsecode1",getImageUrl);
                         Log.i("resoponsecode2",getPostDescription);
                         Log.i("resoponsecode3",getFullName);

                         name.add(getFullName);
                         description.add(getPostDescription);
                         image.add(getImageUrl);





                     }

                   /* String responseCode =String.valueOf(response.code());
                    String getImageUrl=response.body().getResult().getPostLists().get(0).getImageLists().get(0).getImageUrl();
                    String getPostDescription=String.valueOf(response.body().getResult().getPostLists().get(0).getPostDescription());
                    String getFullName=String.valueOf(response.body().getResult().getPostLists().get(0).getAuthorInfo().getFullName());

                    profilePresenterView.responceProfile(responseCode,getImageUrl,getPostDescription,getFullName);

                    */

                    profilePresenterView.responceProfile(name,description,image);



                }else{
                    Log.i("SignUpPresenteResponse",""+response.code());


                    Gson gson = new GsonBuilder().create();
                    ErrorData mError = new ErrorData();


                    try {
                        mError = gson.fromJson(response.errorBody().string(), ErrorData.class);
                        profilePresenterView.getErrorSignUpPresenter(mError.getServerResponse().getMessage());



                    }
                    catch (IOException e) {
                        Log.i("SignUpPresetexception",""+e.toString());

                    }

                }


            }

            @Override
            public void onFailure(Call<ProfileView> call, Throwable t) {

                Log.i("SignUpFailureNET",""+call.toString().trim());



            }
        });
    }




    public interface ProfilePresenterView{

        void getErrorSignUpPresenter(String error);
        void responceProfile(ArrayList<String> name,ArrayList<String> desctiption,ArrayList<String> image);


    }

}
