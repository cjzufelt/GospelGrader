package com.cjzufelt.gospelgrader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Nephi1Activity extends AppCompatActivity {
    Button chapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nephi1);

        chapter1 = findViewById(R.id.nephi1Chapter1);

        chapter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToChapter1();
            }
        });
    }

    void switchToChapter1() {
        Intent scripturesIntent = new Intent(this, Nephi1Chapter1Activity.class);
        startActivity(scripturesIntent);
    }
}
