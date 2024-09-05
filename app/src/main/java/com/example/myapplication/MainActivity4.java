package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity4 extends AppCompatActivity {
    EditText name;
    public static final String Extra_Name ="com.example.myapplication.extra.NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        name =findViewById(R.id.name);
        String nameText =name.getText().toString();

    }

    public void openActivity(View m) {
        Intent intent = new Intent(this, MainActivity5.class);
        name =findViewById(R.id.name);
        String nameText =name.getText().toString();
        intent.putExtra(Extra_Name,nameText);
        startActivity(intent);

    }
}