package com.example.arifrahman;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ParagraphActivity extends AppCompatActivity {

    ImageView backBtn;
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paragraph);

        backBtn = findViewById(R.id.back);
        mRecyclerView = findViewById(R.id.paragraph_rv);


        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(ParagraphActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setHasFixedSize(true);
        ParagraphAdapter paragraphAdapter = new ParagraphAdapter(this);
        mRecyclerView.setAdapter(paragraphAdapter);

    }
}
