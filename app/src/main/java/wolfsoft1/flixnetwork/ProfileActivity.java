package wolfsoft1.flixnetwork;

import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import Adapter.LibraryAdapter;

public class ProfileActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        TabLayout tabLayout = findViewById(R.id.tab);
        final WrapContentHeightViewPager wrapContentHeightViewPager = findViewById(R.id.vp);

        tabLayout.setTabMode(tabLayout.MODE_SCROLLABLE);
        tabLayout.addTab(tabLayout.newTab().setText("Posts"));
        tabLayout.addTab(tabLayout.newTab().setText("Photos"));
        tabLayout.addTab(tabLayout.newTab().setText("Videos"));
        tabLayout.addTab(tabLayout.newTab().setText("Favorite"));

        tabLayout.setTabGravity(TabLayout.MODE_FIXED);
        LibraryAdapter tabAdapter = new LibraryAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        wrapContentHeightViewPager.setAdapter(tabAdapter);

        wrapContentHeightViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                wrapContentHeightViewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}




