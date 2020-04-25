package com.custom_ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class FeedBody extends LinearLayout {

    TextView feed_profile_name_tv;
    TextView feed_profile_place_tv;
    TextView feed_body_desc_tv;
    TextView feed_like_count_tv;
    TextView feed_comment_count_tv;
    ImageView feed_image_iv;
    View feed_share_iv;




    public FeedBody(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setOrientation(LinearLayout.VERTICAL);
        LayoutInflater.from(context).inflate(R.layout.feed_body, this, true);
        feed_image_iv = findViewById(R.id.feed_image_iv);
    }

    public void setFeedProfileName(String profileName) {
        feed_profile_name_tv = findViewById(R.id.feed_profile_name_tv);
        feed_profile_name_tv.setText(profileName);
    }

    public void setFeedProfilePlace(String profilePlace) {
        feed_profile_place_tv = findViewById(R.id.feed_profile_place_tv);
        feed_profile_place_tv.setText(profilePlace);
    }

    public void setFeedBodyDesc(String profileName) {
        feed_body_desc_tv = findViewById(R.id.feed_body_desc_tv);
        feed_body_desc_tv.setText(profileName);
    }

    public void setFeedLikeCount(String profileName) {
        feed_like_count_tv = findViewById(R.id.feed_like_count_tv);
        feed_like_count_tv.setText(profileName);
    }

    public void setFeedCommentCount(String profileName) {
        feed_comment_count_tv = findViewById(R.id.feed_comment_count_tv);
        feed_comment_count_tv.setText(profileName);
    }

    public ImageView getFeed_image_iv() {
        return feed_image_iv;
    }

    public View getFeed_share_iv() {
        return feed_share_iv;
    }
}
