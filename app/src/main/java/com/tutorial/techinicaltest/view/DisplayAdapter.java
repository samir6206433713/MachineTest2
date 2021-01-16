package com.tutorial.techinicaltest.view;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.tutorial.techinicaltest.R;

import java.util.ArrayList;

public class DisplayAdapter
extends RecyclerView.Adapter<DisplayAdapter.MyViewHolder> {

    ArrayList<String> fullname;
    ArrayList<String> description;
    ArrayList<String> personImages;

    private RecyclerViewFamilyListener itemListener;
    int selectedPosition, count = 0;
    Context context;



    public DisplayAdapter(ArrayList<String> fullname, ArrayList<String> description, ArrayList<String> personImages, Context context) {
        this.context = context;
        this.fullname = fullname;
        this.description = description;
        this.personImages = personImages;
    }


    @NonNull
    @Override
    public DisplayAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.activity_page_no2, viewGroup, false);

        return new DisplayAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull DisplayAdapter.MyViewHolder myViewHolder, final int i) {


        Log.i("des00",description.get(i));
        Log.i("des11",fullname.get(i));
        Log.i("des22",personImages.get(i));

        myViewHolder.description.setText(description.get(i));
        myViewHolder.fullname.setText(fullname.get(i));
        Picasso.get().load(personImages.get(i)).into(myViewHolder.image);




        Log.i("count22", "" + count);


    }

    @Override
    public int getItemCount() {

        return fullname.size();
    }



    public class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView image;
        public TextView fullname;
        public TextView description;

        public MyViewHolder(final View view) {
            super(view);
            this.image = (ImageView) itemView.findViewById(R.id.image);
            this.fullname = (TextView) itemView.findViewById(R.id.fullname);
            this.description = (TextView) itemView.findViewById(R.id.description);


            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    selectedPosition=getAdapterPosition();
                    //  notifyDataSetChanged();
                    itemListener.recyclerViewListClicked(v,selectedPosition);
                }
            });



        }
    }
}


