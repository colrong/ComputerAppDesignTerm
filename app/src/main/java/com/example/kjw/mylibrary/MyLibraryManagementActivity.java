package com.example.kjw.mylibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyLibraryManagementActivity extends AppCompatActivity {
    private Button reservedBookButton;
    private Button rentedBookButton;
    private String userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_library_management);
        Intent intent = getIntent();
        userId = intent.getStringExtra("id");

        reservedBookButton = (Button)findViewById(R.id.reserved_book_button);
        reservedBookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyLibraryManagementActivity.this, ReservedBookActivity.class);
                intent.putExtra("id", userId);
                startActivity(intent);
            }
        });

        rentedBookButton = (Button)findViewById(R.id.rented_book_button);
        rentedBookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyLibraryManagementActivity.this, RentedBookActivity.class);
                intent.putExtra("id", userId);
                startActivity(intent);
            }
        });

    }
}
