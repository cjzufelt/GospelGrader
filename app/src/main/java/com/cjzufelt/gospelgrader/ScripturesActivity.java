package com.cjzufelt.gospelgrader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.GridView;

public class ScripturesActivity extends AppCompatActivity {
    Button nephi1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scriptures);

        nephi1 = findViewById(R.id.nephi1);

        nephi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToNephi1();
            }
        });
    }

    void switchToNephi1() {
        Intent scripturesIntent = new Intent(this, Nephi1Activity.class);
        startActivity(scripturesIntent);
    }
}
