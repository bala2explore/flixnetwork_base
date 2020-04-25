package com.custom_ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class FeedHeader extends LinearLayout {

    TextView feed_profile_name_tv;
    TextView feed_profile_place_tv;

    public FeedHeader(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setOrientation(LinearLayout.VERTICAL);
        LayoutInflater.from(context).inflate(R.layout.feed_header, this, true);
    }

    public void setFeedProfileName(String profileName) {
        feed_profile_name_tv = (TextView) findViewById(R.id.feed_profile_name_tv);
        feed_profile_name_tv.setText(profileName);
    }

    public void setFeedProfilePlace(String profilePlace) {
        feed_profile_place_tv = (TextView) findViewById(R.id.feed_profile_place_tv);
        feed_profile_place_tv.setText(profilePlace);
    }

}
