package com.solinftec.exemplo_mapbox.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.solinftec.exemplo_mapbox.R;

public class SelecaoActivity extends AppCompatActivity {

    private Button btnMapBox;
    private Button btnGridView;
    private Button btnTextDinamico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecao);

        btnMapBox = findViewById(R.id.btnMapBoxItem);
        btnGridView = findViewById(R.id.btnGridViewItem);
        btnTextDinamico = findViewById(R.id.btnTextDinamico);

        eventosClicks();
    }

    private void eventosClicks() {
        btnMapBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), MainActivity.class));
            }
        });

        btnGridView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), GridViewActivity.class));
            }
        });
        btnTextDinamico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), TextViewDinamicoActivity.class));
            }
        });
    }
}
