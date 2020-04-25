package Adapter;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ModelClasses.FlixModel;
import wolfsoft1.flixnetwork.R;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.ViewHolder>{

    private Context context;
    private List<FlixModel> flixModels;

    public SearchAdapter(Context context, List<FlixModel> flixModels) {
        this.context = context;
        this.flixModels = flixModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_search_2,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,final int position) {
        holder.Name.setText(flixModels.get(position).getTxt1());
        holder.follow.setText(flixModels.get(position).getTxt2());
        holder.des.setText(flixModels.get(position).getTxt3());
        holder.likes.setText(flixModels.get(position).getTxt4());
        holder.comment.setText(flixModels.get(position).getTxt5());
        holder.profileImage.setImageResource(flixModels.get(position).getImg1());
        holder.tag.setImageResource(flixModels.get(position).getImg2());
        holder.img2.setImageResource(flixModels.get(position).getImg3());

    }

    @Override
    public int getItemCount() {
        return flixModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView Name,follow,des,likes,comment ;
        ImageView profileImage,tag,img2;
        public ViewHolder(View itemView) {
            super(itemView);

            Name = itemView.findViewById(R.id.Name);
            follow = itemView.findViewById(R.id.follow);
            des = itemView.findViewById(R.id.des);
            likes = itemView.findViewById(R.id.likes);
            comment = itemView.findViewById(R.id.comment);
            profileImage = itemView.findViewById(R.id.profileImage);
            tag = itemView.findViewById(R.id.tag);
            img2 = itemView.findViewById(R.id.img2);
        }
    }
}