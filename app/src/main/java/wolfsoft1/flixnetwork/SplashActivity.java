package wolfsoft1.flixnetwork;

import android.os.Bundle;

import com.custom_ui.FeedBody;
import com.custom_ui.FeedHeader;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class SplashActivity extends AppCompatActivity {

    @BindView(R.id.feed_body)
    FeedBody feedBody;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customview_sample);
//        setSupportActionBar(findViewById(R.id.my_toolbar));
        ButterKnife.bind(this);

        feedBody.setFeedProfileName("Bala");
        feedBody.setFeedProfilePlace("Vellore, Tamilnadu");
        feedBody.setFeedBodyDesc("Dont trust anybody");
        feedBody.getFeed_image_iv().setImageResource(R.drawable.girl1);
        feedBody.setFeedLikeCount("100");
        feedBody.setFeedCommentCount("50");

        System.out.println("Test");




//        Thread background = new Thread() {
//            public void run() {
//
//                try {
//                    // Thread will sleep for 5 seconds
//                    sleep(2*1000);
//
//                    Intent intent = new Intent(SplashActivity.this,Hotel_Inn_List_Activity.class);
//                    startActivity(intent);
//
//
//                    // After 5 seconds redirect to another intent
//
//
//                    //Remove activity
//                    finish();
//
//                } catch (Exception e) {
//
//                }
//            }
//        };
//
//        // start thread
//        background.start();


    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
    }
}
