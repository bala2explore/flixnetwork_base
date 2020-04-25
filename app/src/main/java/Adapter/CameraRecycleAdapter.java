package Adapter;

import android.content.Context;
import android.graphics.Color;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ModelClasses.HotelInnListModelClass;
import wolfsoft1.flixnetwork.R;


public class CameraRecycleAdapter extends RecyclerView.Adapter<CameraRecycleAdapter.MyViewHolder>{

    Context context;


    private List<HotelInnListModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {



        TextView title;


        public MyViewHolder(View view) {
            super(view);

            title=(TextView)view.findViewById(R.id.title);




        }

    }


    public CameraRecycleAdapter(Context context, List<HotelInnListModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public CameraRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_camera_list, parent, false);








        return new CameraRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final  int position) {
        HotelInnListModelClass lists = OfferList.get(position);
        holder.title.setText(lists.getTitle());



        if (position==0){

            holder.title.setTextColor(Color.parseColor("#ffffff"));
        }else {
            holder.title.setTextColor(Color.parseColor("#707070"));
        }


    }



    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


