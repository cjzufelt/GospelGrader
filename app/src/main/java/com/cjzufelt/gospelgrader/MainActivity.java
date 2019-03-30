package com.cjzufelt.gospelgrader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button scriptures;
    Button leaderboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scriptures = findViewById(R.id.scripturesButton);
        leaderboard = findViewById(R.id.leaderboardButton);

        scriptures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent scripturesIntent = new Intent(this, ScripturesActivity.class);
                startActivity(scripturesIntent);
            }
        });

        leaderboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent leaderboardIntent = new Intent(this, LeaderboardActivity.class);
                startActivity(leaderboardIntent);
            }
        });
    }
}
