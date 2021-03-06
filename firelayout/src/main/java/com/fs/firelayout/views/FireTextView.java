package com.fs.firelayout.views;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import com.fs.firelayout.FireView;

import java.util.HashMap;

/**
 * Created by Francesco on 22/01/17.
 */

public class FireTextView extends FireView {

    public FireTextView(Context context, HashMap<String, Object> map) {
        init(context, map);
    }

    @Override
    public View generateView(Context mContext) {
        TextView textView = new TextView(mContext);

        textView.setText(getValue("text", ""));

        String textColor = getValue("textColor", null);
        if (textColor != null)
            textView.setTextColor(Color.parseColor(textColor));

        textView.setGravity(getGravity("gravity"));

        return textView;
    }
}
