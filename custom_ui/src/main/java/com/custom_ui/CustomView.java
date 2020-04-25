package com.custom_ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class CustomView extends LinearLayout {

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setOrientation(LinearLayout.VERTICAL);
        LayoutInflater.from(context).inflate(R.layout.feed_header, this, true);

        String title;
        String subtitle;
//        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.CustomView, 0, 0);

//        try {
//            title = a.getString(R.styleable.CustomView_customViewTitle);
//            subtitle = a.getString(R.styleable.CustomView_customViewSubtitle);
//        } finally {
//            a.recycle();
//        }
//
//        // Throw an exception if required attributes are not set
//        if (title == null) {
//            throw new RuntimeException("No title provided");
//        }
//        if (subtitle == null) {
//            throw new RuntimeException("No subtitle provided");
//        }

//        init(title, subtitle);
    }

    // Setup views
    private void init(String title, String subtitle) {
        TextView titleView = (TextView) findViewById(R.id.customview_textview_title);
        TextView subtitleView = (TextView) findViewById(R.id.customview_textview_subtitle);

        titleView.setText(title);
        subtitleView.setText(subtitle);
    }
}
