package com.example.my;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContentActivity extends AppCompatActivity
{
    Button bookButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        bookButton =(Button)findViewById(R.id.book);

        bookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContentActivity.this,BookActivity.class);
                startActivity(intent);
            }
        });


    }
}
