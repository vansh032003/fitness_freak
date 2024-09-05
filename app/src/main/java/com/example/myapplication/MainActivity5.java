package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        textView = findViewById(R.id.textView);
        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity4.Extra_Name );

        textView.setText("Hi," + name);
    }
    public void openActivity(View a) {
        Intent intent = new Intent(this, MainActivity601.class);
        startActivity(intent);
    }
    public void openActivity2(View n) {
        Intent intent = new Intent(this, MainActivity602.class);
        startActivity(intent);
    }
    public void openActivity3(View n) {
        Intent intent = new Intent(this, MainActivity63.class);
        startActivity(intent);
    }
    public void openActivity4(View n) {
        Intent intent = new Intent(this, MainActivity604.class);
        startActivity(intent);
    }
    public void openActivity5(View s) {
        Intent intent = new Intent(this, MainActivity605.class);
        startActivity(intent);
    }
    public void openActivity6(View n) {
        Intent intent = new Intent(this, MainActivity606.class);
        startActivity(intent);
        }
}