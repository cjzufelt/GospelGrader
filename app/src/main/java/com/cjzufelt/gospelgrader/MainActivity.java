// TODO: Use the JSON and remove 1 Nephi 1 hardcoded text

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
                switchToScriptures();
            }
        });

        leaderboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToLeaderboard();
            }
        });
    }

    void switchToScriptures() {
        Intent scripturesIntent = new Intent(this, ScripturesActivity.class);
        startActivity(scripturesIntent);
    }

    void switchToLeaderboard() {
        Intent leaderboardIntent = new Intent(this, LeaderboardActivity.class);
        startActivity(leaderboardIntent);
    }
}
