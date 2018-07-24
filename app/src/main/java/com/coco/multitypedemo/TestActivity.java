package com.coco.multitypedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity {

    private TextView textView;
    private String s;
    private EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Button btn = findViewById(R.id.btn);
        textView = findViewById(R.id.text);
        edit = findViewById(R.id.edit);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = edit.getText().toString().trim();
                textView.setText(s);
                Toast.makeText(TestActivity.this, s, Toast.LENGTH_SHORT).show();
            }
        });



    }
}
