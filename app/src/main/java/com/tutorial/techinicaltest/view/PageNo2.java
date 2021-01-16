package com.tutorial.techinicaltest.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bigkoo.svprogresshud.SVProgressHUD;
import com.tutorial.techinicaltest.R;
import com.tutorial.techinicaltest.presenter.ProfilePresenter;

import java.util.ArrayList;

public class PageNo2 extends AppCompatActivity implements ProfilePresenter.ProfilePresenterView {
    private SVProgressHUD mSVProgressHUD;
    ProfilePresenter profilePresenter;
    String action="homePage";
    String pageNo="1";
    String timeZone="Asia/Kolkata";

    ImageView image;
    TextView fullname;
    TextView description;
    RecyclerView recyclerView;

    DisplayAdapter adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displaypage);

        mSVProgressHUD = new SVProgressHUD(this);


        profilePresenter=new ProfilePresenter(this);

        Bundle extras = getIntent().getExtras();
        String accesstoken = extras.getString("accessToken");





        mSVProgressHUD.showWithStatus("Please Wait");

        profilePresenter.retrofitProfile(accesstoken,action,pageNo,timeZone);



    }


    @Override
    public void getErrorSignUpPresenter(String error) {
        mSVProgressHUD.dismiss();

        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void responceProfile(ArrayList<String> name, ArrayList<String> desctiption, ArrayList<String> image) {



        mSVProgressHUD.dismiss();
        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);
        adapter2=new DisplayAdapter(name,desctiption,image,PageNo2.this);

        recyclerView.setAdapter(adapter2);
        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL));
    }


}