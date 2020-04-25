package wolfsoft1.flixnetwork;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import Adapter.GridAdapter;
import Adapter.ProfileAdapter;
import ModelClasses.GridModel;
import ModelClasses.HomeModel;

public class Profile2Activity extends AppCompatActivity {

    private ArrayList<HomeModel> homeListModelClassArrayList;
    private RecyclerView recyclerView1;
    private ProfileAdapter mAdapter;

    Integer img1[]={R.drawable.men1,R.drawable.girl1,R.drawable.girl3,R.drawable.men11,R.drawable.girl5};
    Integer img2[]={R.drawable.men3,R.drawable.girl2,R.drawable.girl4,R.drawable.men12,R.drawable.girl4};
    String frameLive[]={"Live","Live","Live","Live","Live"};



    private ArrayList<GridModel> homeListModelClassArrayList1;
    private RecyclerView recyclerView;
    private GridAdapter bAdapter;

    Integer fieldImage[]={R.drawable.cycle,R.drawable.cycle2,R.drawable.girlhorse,
                        R.drawable.girlreading,R.drawable.pinappple,R.drawable.oldmen,
                        R.drawable.beach,R.drawable.starfish,R.drawable.oldguy};
    String fieldName[]={"+490","+490","+490","+490","+490","+490","+490","+490","+490"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile2);

        recyclerView1 = (RecyclerView)findViewById(R.id.recyclerView1);
        homeListModelClassArrayList = new ArrayList<>();

        for (int i = 0; i < img1.length; i++) {
            HomeModel beanClassForRecyclerView_contacts = new HomeModel(img1[i],img2[i],frameLive[i]);
            homeListModelClassArrayList.add(beanClassForRecyclerView_contacts);
        }
        mAdapter = new ProfileAdapter(Profile2Activity.this,homeListModelClassArrayList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(Profile2Activity.this,LinearLayoutManager.HORIZONTAL, false);
        recyclerView1.setLayoutManager(mLayoutManager);
        recyclerView1.setItemAnimator(new DefaultItemAnimator());
        recyclerView1.setAdapter(mAdapter);


        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(Profile2Activity.this,3);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        homeListModelClassArrayList1 = new ArrayList<>();

        for (int i = 0; i < fieldName.length; i++) {
            GridModel beanClassForRecyclerView_contacts = new GridModel(fieldName[i],fieldImage[i]);
            homeListModelClassArrayList1.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new GridAdapter(Profile2Activity.this,homeListModelClassArrayList1);
        recyclerView.setAdapter(bAdapter);

    }
}

