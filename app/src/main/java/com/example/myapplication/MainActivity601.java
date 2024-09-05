package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity601 extends AppCompatActivity {

    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main601);

        button5 =findViewById(R.id.button5);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=iCQ2gC4DqJw&ab_channel=BullyJuice");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri =Uri.parse(s);
        startActivity((new Intent(Intent.ACTION_VIEW,uri)));

    }
}