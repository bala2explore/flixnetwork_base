package Adapter;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ModelClasses.HotelInnListModelClass;
import wolfsoft1.flixnetwork.AddPostActivity;
import wolfsoft1.flixnetwork.CallActivity;
import wolfsoft1.flixnetwork.CallupActivity;
import wolfsoft1.flixnetwork.CameraActivity;
import wolfsoft1.flixnetwork.CreateAccountActivity;
import wolfsoft1.flixnetwork.Home1Activity;
import wolfsoft1.flixnetwork.Home2Activity;
import wolfsoft1.flixnetwork.Home3Activity;
import wolfsoft1.flixnetwork.ImagePostActivity;
import wolfsoft1.flixnetwork.JoinActivity;
import wolfsoft1.flixnetwork.NotificationActivity;
import wolfsoft1.flixnetwork.PostDetailActivity;
import wolfsoft1.flixnetwork.Profile2Activity;
import wolfsoft1.flixnetwork.ProfileActivity;
import wolfsoft1.flixnetwork.R;
import wolfsoft1.flixnetwork.SearchActivity;
import wolfsoft1.flixnetwork.SettingActivity;
import wolfsoft1.flixnetwork.Walkthrough1Activity;
import wolfsoft1.flixnetwork.Walkthrough2Activity;
import wolfsoft1.flixnetwork.Walkthrough3Activity;


public class HotelInnListRecycleAdapter extends RecyclerView.Adapter<HotelInnListRecycleAdapter.MyViewHolder>{

    Context context;


    private List<HotelInnListModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {



        TextView title;


        public MyViewHolder(View view) {
            super(view);

            title=(TextView)view.findViewById(R.id.title);




        }

    }


    public HotelInnListRecycleAdapter(Context context, List<HotelInnListModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public HotelInnListRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_hotel_inn_list, parent, false);


        return new HotelInnListRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final  int position) {
        HotelInnListModelClass lists = OfferList.get(position);
        holder.title.setText(lists.getTitle());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (position == 0) {
                    Intent i = new Intent(context, CallActivity.class);
                    context.startActivity(i);
                }else  if (position ==1){
                    Intent i = new Intent(context, CallupActivity.class);
                    context.startActivity(i);
                }else  if (position ==2){
                    Intent i = new Intent(context, CreateAccountActivity.class);
                    context.startActivity(i);
                }else  if (position ==3){
                    Intent i = new Intent(context, Home1Activity.class);
                    context.startActivity(i);
                }else  if (position ==4){
                    Intent i = new Intent(context, Home2Activity.class);
                    context.startActivity(i);
                }else  if (position ==5){
                    Intent i = new Intent(context, Home3Activity.class);
                    context.startActivity(i);
                }else  if (position ==6){
                    Intent i = new Intent(context, ImagePostActivity.class);
                    context.startActivity(i);
                }else  if (position ==7){
                    Intent i = new Intent(context, JoinActivity.class);
                    context.startActivity(i);
                }else  if (position ==8){
                    Intent i = new Intent(context, PostDetailActivity.class);
                    context.startActivity(i);
                }else  if (position ==9){
                    Intent i = new Intent(context, SettingActivity.class);
                    context.startActivity(i);
                }else  if (position ==10){
                    Intent i = new Intent(context, Walkthrough1Activity.class);
                    context.startActivity(i);
                }else  if (position ==11){
                    Intent i = new Intent(context, Walkthrough3Activity.class);
                    context.startActivity(i);
                }else  if (position ==12){
                    Intent i = new Intent(context, Profile2Activity.class);
                    context.startActivity(i);
                }
                else  if (position ==13){
                    Intent i = new Intent(context, ProfileActivity.class);
                    context.startActivity(i);
                } else  if (position ==14){
                    Intent i = new Intent(context, Walkthrough2Activity.class);
                    context.startActivity(i);
                }else  if (position ==15){
                    Intent i = new Intent(context, SearchActivity.class);
                    context.startActivity(i);
                }else  if (position ==16){
                    Intent i = new Intent(context,NotificationActivity.class);
                    context.startActivity(i);
                }else  if (position ==17){
                    Intent i = new Intent(context,AddPostActivity.class);
                    context.startActivity(i);
                }else  if (position ==18){
                    Intent i = new Intent(context,CameraActivity.class);
                    context.startActivity(i);
                }
            }

        });



    }



    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


