package wolfsoft1.flixnetwork;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import Adapter.HomeAdapter;
import ModelClasses.HomeModel;

public class Home1Activity extends AppCompatActivity {

    private ArrayList<HomeModel> homeListModelClassArrayList;
    private RecyclerView recyclerView;
    private HomeAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home1);

        Integer img1[]={R.drawable.men1,R.drawable.girl1,R.drawable.girl3,R.drawable.men11,R.drawable.girl5};
        Integer img2[]={R.drawable.men3,R.drawable.girl2,R.drawable.girl4,R.drawable.men12,R.drawable.girl4};
        String frameLive[]={"Live","Live","Live","Live","Live"};



        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        homeListModelClassArrayList = new ArrayList<>();

        for (int i = 0; i < img1.length; i++) {
            HomeModel beanClassForRecyclerView_contacts = new HomeModel(img1[i],img2[i],frameLive[i]);
            homeListModelClassArrayList.add(beanClassForRecyclerView_contacts);
        }
        mAdapter = new HomeAdapter(Home1Activity.this,homeListModelClassArrayList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(Home1Activity.this,LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }
}
