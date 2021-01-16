package com.tutorial.techinicaltest.presenter;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tutorial.techinicaltest.model.ErrorData;
import com.tutorial.techinicaltest.model.LoginPojo;
import com.tutorial.techinicaltest.model.SignUpResponse;
import com.tutorial.techinicaltest.network.ApiInterface;
import com.tutorial.techinicaltest.network.Apiclient;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;

public class LoginPresenter {

    LoginPresenterView loginPresenterView;
    private Context context;


    public LoginPresenter(LoginPresenterView loginPresenterView){
        this.loginPresenterView = loginPresenterView;

    }



    public void retrofitLogin(String email,String password,String action)
    {

        Map<String,String> map = new HashMap<>();
        /*map.put("Content-Type","application/json");
        map.put("wallet_id", "Preferences.walletidforapi");*/

        MediaType mediaType = MediaType.parse("application/json");

        JSONObject obj = new JSONObject();
        try {
            obj.put("action",action);
            obj.put("email",email);
            obj.put("password",password);
            Log.i("SignUpPresenterBody",obj.toString());

        } catch (JSONException e) {
            e.printStackTrace();
        }



        Log.i("SignUpPresenterBody",""+obj.toString());
        RequestBody body = RequestBody.create(mediaType,obj.toString());

        ApiInterface apiService =
                Apiclient.getClient().create(ApiInterface.class);

        Call<LoginPojo> call = (Call<LoginPojo>) apiService.getSignInResult(body);
        call.enqueue(new Callback<LoginPojo>() {
            @Override
            public void onResponse(Call<LoginPojo> call, retrofit2.Response<LoginPojo> response) {


                if (response.code() == 200){

                    try{
                        loginPresenterView.responceSignup(String.valueOf(response.code()),response.body().getResult().getProfileDetails().getAccessToken(),response.body().getResult().getProfileDetails().getRtmToken(),response.body().getResult().getProfileDetails().getFullName());

                    }
                    catch (Exception e){
                        loginPresenterView.getErrorSignUpPresenter("Some thing went wrong, please try again with proper login credentials");

                    }






                }else{
                    Log.i("SignUpPresenteResponse",""+response.code());


                    Gson gson = new GsonBuilder().create();
                    ErrorData mError = new ErrorData();


                    try {
                        mError = gson.fromJson(response.errorBody().string(), ErrorData.class);
                        loginPresenterView.getErrorSignUpPresenter(mError.getServerResponse().getMessage());



                    }
                    catch (IOException e) {
                        Log.i("SignUpPresetexception",""+e.toString());

                    }

                }


            }

            @Override
            public void onFailure(Call<LoginPojo> call, Throwable t) {

                Log.i("SignUpFailureNET",""+call.toString().trim());



            }
        });
    }




    public interface LoginPresenterView{

        void getErrorSignUpPresenter(String error);
        void responceSignup(String resonse, String accessToken, String rtmToken,String fullName);


    }


}
