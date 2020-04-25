package Adapter;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ModelClasses.GridModel;
import wolfsoft1.flixnetwork.R;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.MyViewHolder>{

    Context context;


    private List<GridModel> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {



        ImageView fieldImage,tick;
        TextView fieldName;

        public MyViewHolder(View view) {
            super(view);

            fieldName=(TextView)view.findViewById(R.id.fieldName);

            fieldImage=(ImageView)view.findViewById(R.id.fieldImage);



        }

    }


    public GridAdapter(Context mainActivityContacts, ArrayList<GridModel> offerList) {
        this.OfferList = offerList;
        this.context = mainActivityContacts;
    }

    @Override
    public GridAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_profile2, parent, false);


        return new GridAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(GridAdapter.MyViewHolder holder, int position) {
        GridModel lists = OfferList.get(position);


        holder.fieldName.setText(lists.getFieldName());
        holder.fieldImage.setImageResource(lists.getFieldImage());

        if (position == 8) {

           holder.fieldName.setVisibility(View.VISIBLE);
        }
        else {
            holder.fieldName.setVisibility(View.GONE);
        }

    }



    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}

