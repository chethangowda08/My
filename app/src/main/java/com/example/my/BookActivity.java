package com.example.my;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BookActivity extends AppCompatActivity
{
    Button bookingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        bookingButton = (Button)findViewById(R.id.booking);

        bookingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (BookActivity.this,ThankyouActivity.class);
                startActivity(intent);
                Toast.makeText(BookActivity.this, "Your Service is Booked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
