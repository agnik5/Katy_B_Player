package com.example.android.katybplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows On The Mission LP
        final RelativeLayout mission = (RelativeLayout) findViewById(R.id.on_a_mission);

        // Set a click listener on that View
        mission.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the On The Mission View is clicked on.
            @Override
            public void onClick(View view) {
                Intent missionIntent = new Intent(MainActivity.this, Mission.class);
                startActivity(missionIntent);
            }
        });

        // Find the View that shows Little Red LP
        final RelativeLayout littleRed = (RelativeLayout) findViewById(R.id.little_red);

        // Set a click listener on that View
        littleRed.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Little Red Vie is clicked on.
            @Override
            public void onClick(View view) {
                Intent littleRedIntent = new Intent(MainActivity.this, LittleRed.class);
                startActivity(littleRedIntent);
            }
        });

        // Find the View that shows On The Mission LP
        final RelativeLayout honey = (RelativeLayout) findViewById(R.id.honey);

        // Set a click listener on that View
        honey.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Honey View is clicked on.
            @Override
            public void onClick(View view) {
                Intent honeyIntent = new Intent(MainActivity.this, Honey.class);
                startActivity(honeyIntent);
            }
        });
    }
}
