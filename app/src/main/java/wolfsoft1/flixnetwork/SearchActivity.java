package wolfsoft1.flixnetwork;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import Adapter.SearchAdapter;
import ModelClasses.FlixModel;

public class SearchActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private SearchAdapter subCategory2_1HorizontalAdapter;
    private ArrayList<FlixModel> activityListModelArrayList;


    String Name[]={"#UIUXDesign","#UIUXDesign"};
    String follow[]={"Follow","Follow"};
    String des[]={"By WSDesign Studios","By Artua"};
    String likes[]={"534","534"};
    String comment[]={"25","25"};
    Integer profileImage[]={R.drawable.girl7,R.drawable.men4};
    Integer img2[]={R.drawable.girlreading,R.drawable.girlhorse};
    Integer tag[]={R.drawable.bookmark_black,R.drawable.bookmark_black_dark};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(SearchActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        activityListModelArrayList = new ArrayList<>();

        for (int i=0;i<Name.length;i++){
            FlixModel activityListModel = new FlixModel();
            activityListModel.setTxt1(Name[i]);
            activityListModel.setTxt2(follow[i]);
            activityListModel.setTxt3(des[i]);
            activityListModel.setTxt4(likes[i]);
            activityListModel.setTxt5(comment[i]);
            activityListModel.setImg1(profileImage[i]);
            activityListModel.setImg2(tag[i]);
            activityListModel.setImg3(img2[i]);

            activityListModelArrayList.add(activityListModel);
        }

        subCategory2_1HorizontalAdapter = new SearchAdapter(SearchActivity.this,activityListModelArrayList);
        recyclerView.setAdapter(subCategory2_1HorizontalAdapter);

    }
}
