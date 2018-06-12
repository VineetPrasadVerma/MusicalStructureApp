package com.example.vineetprasadverma.musicalstructureapp;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView englishTextView = findViewById(R.id.english_songs);
        // Set a click listener on that View
        englishTextView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the english song View is clicked on.
            @Override
            public void onClick(View view) {
                Intent englishIntent = new Intent(MainActivity.this, EnglishSongsActivity.class);
                startActivity(englishIntent);
            }
        });

        TextView hindiTextView = findViewById(R.id.hindi_songs);
        hindiTextView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the hindi songs View is clicked on.
            @Override
            public void onClick(View view) {
                Intent hindiIntent = new Intent(MainActivity.this, HindiSongsActivity.class);
                startActivity(hindiIntent);
            }
        });

        TextView bhojpuriTextView = findViewById(R.id.bhojpuri_songs);
        bhojpuriTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            // The code in this method will be executed when the bhojpuri songs View is clicked on.
            public void onClick(View view) {
                Intent bhojpuriIntent = new Intent(MainActivity.this,BhojpuriSongsActivity.class);
                startActivity(bhojpuriIntent);
            }
        });

        TextView popTextView = findViewById(R.id.pop_songs);
        popTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            // The code in this method will be executed when the pop songs View is clicked on.
            public void onClick(View view) {
                Intent popTextView = new Intent(MainActivity.this,PopSongsActivity.class);
                startActivity(popTextView);
            }
        });

    }
}
