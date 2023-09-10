package com.codingwithmitch.googlemaps2018;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class menu extends AppCompatActivity {
    private TextView pr1;
    private TextView pr2;
    private TextView pr3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        pr1 = findViewById(R.id.pr1);
        pr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this, project1.class);
                        startActivity(intent);
            }
        });
        pr2 = findViewById(R.id.pr2);
        pr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this, project2.class);
                startActivity(intent);
            }
        });
        pr3 = findViewById(R.id.pr3);
        pr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menu.this, project5.class);
                startActivity(intent);
            }
        });
    }

}
