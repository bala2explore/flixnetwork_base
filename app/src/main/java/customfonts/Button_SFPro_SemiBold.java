package customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

public class Button_SFPro_SemiBold extends Button {

    public Button_SFPro_SemiBold(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public Button_SFPro_SemiBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Button_SFPro_SemiBold(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/SF-Pro-Display-Semibold.otf");
            setTypeface(tf);
        }
    }
}
