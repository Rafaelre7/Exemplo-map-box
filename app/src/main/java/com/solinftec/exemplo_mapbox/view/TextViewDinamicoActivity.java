package com.solinftec.exemplo_mapbox.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;

import com.solinftec.exemplo_mapbox.R;

public class TextViewDinamicoActivity extends Activity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view_dinamico);


        LinearLayout linearLayout = findViewById(R.id.infoDinamico);
        TextView txt1 = new TextView(TextViewDinamicoActivity.this);
        linearLayout.setBackgroundColor(Color.TRANSPARENT);
        linearLayout.addView(txt1);

        for(int j=0;j<30;j++) {
            LinearLayout childLayout = new LinearLayout(TextViewDinamicoActivity.this);
            LinearLayout.LayoutParams linearParams = new LinearLayout.LayoutParams(
                    LayoutParams.WRAP_CONTENT,
                    LayoutParams.WRAP_CONTENT);
            childLayout.setLayoutParams(linearParams);

            TextView mType = new TextView(TextViewDinamicoActivity.this);
            TextView mValue = new TextView(TextViewDinamicoActivity.this);

            mType.setLayoutParams(new TableLayout.LayoutParams(
                    LayoutParams.MATCH_PARENT,
                    LayoutParams.WRAP_CONTENT, 1f));
            mValue.setLayoutParams(new TableLayout.LayoutParams(
                    LayoutParams.WRAP_CONTENT,
                    LayoutParams.WRAP_CONTENT, 1f));

            mType.setTextSize(17);
            mType.setPadding(5, 3, 0, 3);
            mType.setTypeface(Typeface.DEFAULT_BOLD);
            mType.setGravity(Gravity.LEFT | Gravity.CENTER);

            mValue.setTextSize(16);
            mValue.setPadding(5, 3, 0, 3);
            mValue.setTypeface(null, Typeface.ITALIC);
            mValue.setGravity(Gravity.LEFT | Gravity.CENTER);

            mType.setText("111");
            mValue.setText("111");

            childLayout.addView(mValue, 0);
            childLayout.addView(mType, 0);

            linearLayout.addView(childLayout);
        }
/*        View linearLayout = findViewById(R.id.infoDinamico);


        TextView valueTV = new TextView(this);
        valueTV.setText("hallo hallo");
        valueTV.setId(5);
        valueTV.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

        ((LinearLayout) linearLayout).addView(valueTV);*/

    }
}
