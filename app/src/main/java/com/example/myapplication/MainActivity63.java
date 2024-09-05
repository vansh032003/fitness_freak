package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity63 extends AppCompatActivity {

    Button button7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main63);

        button7 =findViewById(R.id.button7);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=i27K2ry9jEo&ab_channel=ATHLEAN-X%E2%84%A2");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri =Uri.parse(s);
        startActivity((new Intent(Intent.ACTION_VIEW,uri)));

    }
}