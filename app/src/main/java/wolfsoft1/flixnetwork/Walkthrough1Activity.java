package wolfsoft1.flixnetwork;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import Adapter.ProfilePagerAdapter_walkthrough_01;

public class Walkthrough1Activity extends AppCompatActivity {

    private ViewPager viewPager;
    private ProfilePagerAdapter_walkthrough_01 profilePagerAdapterWalkthrough01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough1);
        viewPager = (ViewPager) findViewById(R.id.viewPager);



        profilePagerAdapterWalkthrough01 = new ProfilePagerAdapter_walkthrough_01(getSupportFragmentManager());

        viewPager.setAdapter(profilePagerAdapterWalkthrough01);



    }
}
