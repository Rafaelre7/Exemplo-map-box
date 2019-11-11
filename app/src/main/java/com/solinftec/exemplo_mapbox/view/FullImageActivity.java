package com.solinftec.exemplo_mapbox.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.solinftec.exemplo_mapbox.R;
import com.solinftec.exemplo_mapbox.adapter.ImageAdapter;

public class FullImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_details);

        // Get intent data
        Intent i = getIntent();
        // Get Selected Image Id
        int position = i.getExtras().getInt("id");
        ImageAdapter imageAdapter = new ImageAdapter(this);
        ImageView imageView = findViewById(R.id.full_image_view);
        imageView.setImageResource(imageAdapter.thumbImages[position]);

    }
}
