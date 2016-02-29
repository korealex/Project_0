package com.example.korealex.project_0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button spotify = (Button) findViewById(R.id.spotify_streamer);
        spotify.setOnClickListener(this);

        Button scores = (Button) findViewById(R.id.scores);
        scores.setOnClickListener(this);

        Button library = (Button) findViewById(R.id.library);
        library.setOnClickListener(this);

        Button bigger = (Button) findViewById(R.id.bigger);
        bigger.setOnClickListener(this);

        Button xyz = (Button) findViewById(R.id.xyz);
        xyz.setOnClickListener(this);

        Button capstone = (Button) findViewById(R.id.capstone);
        capstone.setOnClickListener(this);







    }

    @Override
    public void onClick(View v) {

        Button b = (Button)v;

        Toast.makeText(MainActivity.this, "This button will launch my "+ b.getText()+" app!", Toast.LENGTH_SHORT).show();

    }
}
