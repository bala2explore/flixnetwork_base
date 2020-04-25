package wolfsoft1.flixnetwork;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    FrameLayout frameLive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLive=(FrameLayout)findViewById(R.id.frameLive);
        frameLive.setVisibility(View.VISIBLE);
    }
}
