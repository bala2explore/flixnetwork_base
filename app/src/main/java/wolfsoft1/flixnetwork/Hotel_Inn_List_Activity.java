package wolfsoft1.flixnetwork;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import Adapter.HotelInnListRecycleAdapter;
import ModelClasses.HotelInnListModelClass;


public class Hotel_Inn_List_Activity extends AppCompatActivity {

    private ArrayList<HotelInnListModelClass> cocoNewsListModelClasses;
    private RecyclerView recyclerView;
    private HotelInnListRecycleAdapter bAdapter;

    String txt[]= {"CallActivity","CallupActivity","CreateAccountActivity","Home1Activity",
            "Home2Activity", "Home3Activity","ImagePostActivity","JoinActivity",
            "PostDetailActivity","SettingActivity","Walkthrough1Activity",
            "Walkthrough3Activity","Profile2Activity","ProfileActivity",
            "Walkthrough2Activity","SearchActivity","NotificationActivity","AddPostActivity","CameraActivity"};

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_inn_list);

        textView = (TextView)findViewById(R.id.number);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+917490844738"));
                startActivity(intent);

            }
        });


//        UI KITS LIST Recyclerview Code is here

        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Hotel_Inn_List_Activity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        cocoNewsListModelClasses = new ArrayList<>();

        for (int i = 0; i < txt.length; i++) {
            HotelInnListModelClass beanClassForRecyclerView_contacts = new HotelInnListModelClass(txt[i]);
            cocoNewsListModelClasses.add(beanClassForRecyclerView_contacts);
        }
        bAdapter = new HotelInnListRecycleAdapter(Hotel_Inn_List_Activity.this,cocoNewsListModelClasses);
        recyclerView.setAdapter(bAdapter);
    }
}
