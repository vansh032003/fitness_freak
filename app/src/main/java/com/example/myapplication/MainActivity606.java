package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity606 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main606);
        Button button10;


            button10 =findViewById(R.id.button10);

            button10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    gotoUrl("https://www.youtube.com/watch?v=X6H4l9R3DnY&ab_channel=ATHLEAN-X%E2%84%A2");
                }
            });
        }

        private void gotoUrl(String s) {
            Uri uri =Uri.parse(s);
            startActivity((new Intent(Intent.ACTION_VIEW,uri)));
    }
}