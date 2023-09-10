package com.codingwithmitch.googlemaps2018;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class project2 extends AppCompatActivity {
    private TextView linear;
    private TextView relative;
    private TextView table;
    private TextView linear2;
    private TextView frame;
    private TextView list;
    private TextView grid;
    private TextView text;
    private TextView even;
    private  TextView custom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.project2);

        linear = findViewById(R.id.linear);
        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(project2.this, linearlayout.class);
                startActivity(intent);
            }
        });
        relative = findViewById(R.id.relative);
        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(project2.this, relativelayout.class);
                startActivity(intent);
            }
        });
        table = findViewById(R.id.table);
        table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(project2.this, tablelayout.class);
                startActivity(intent);
            }
        });
        linear2 = findViewById(R.id.linear2);
        linear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(project2.this, linearlayou2.class);
                startActivity(intent);
            }
        });
        frame = findViewById(R.id.frame);
        frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(project2.this, framelayout.class);
                startActivity(intent);
            }
        });
        list = findViewById(R.id.list);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(project2.this, listview.class);
                startActivity(intent);
            }
        });
        grid = findViewById(R.id.grid);
        grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(project2.this, gridview.class);
                startActivity(intent);
            }
        });
        text = findViewById(R.id.text);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(project2.this, textview.class);
                startActivity(intent);
            }
        });
        even = findViewById(R.id.even);
        even.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(project2.this, evenhandling.class);
                startActivity(intent);
            }
        });
        custom = findViewById(R.id.custom);
        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(project2.this, customcomponen.class);
                startActivity(intent);
            }
        });

    }
}

