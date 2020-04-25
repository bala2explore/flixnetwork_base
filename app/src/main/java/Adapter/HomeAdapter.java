package Adapter;

import android.content.Context;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ModelClasses.HomeModel;
import wolfsoft1.flixnetwork.R;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder>{

    Context context;



    private List<HomeModel> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        ImageView img1,img2,add;
        TextView frameLive;



        public MyViewHolder(View view) {
            super(view);

            img1 = (ImageView) view.findViewById(R.id.img1);
            img2 = (ImageView) view.findViewById(R.id.img2);
            add = (ImageView) view.findViewById(R.id.add);
            frameLive=(TextView)view.findViewById(R.id.frameLive);

        }

    }


    public HomeAdapter(Context mainActivityContacts, List<HomeModel> offerList) {
        this.OfferList = offerList;
        this.context = mainActivityContacts;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_home, parent, false);


        return new MyViewHolder(itemView);


    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        HomeModel lists = OfferList.get(position);
       holder.img1.setImageResource(lists.getImg1());
       holder.img2.setImageResource(lists.getImg2());
       holder.frameLive.setText(lists.getFrameLive());





       
       if (position==0) {
           holder.add.setVisibility(View.VISIBLE);

           holder.frameLive.setVisibility(View.VISIBLE);
       }else {
           holder.frameLive.setVisibility(View.GONE);
           holder.add.setVisibility(View.GONE);
       }


    }

    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}

