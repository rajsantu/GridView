package com.mainpackage.gridview;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        gridView = findViewById(R.id.gridView);

        // Data to be displayed into gridview
        ArrayList<CourseModel> courseModelArrayList = new ArrayList<>();
        courseModelArrayList.add(new CourseModel("C Course", R.drawable.c));
        courseModelArrayList.add(new CourseModel("C++ Course", R.drawable.c_plus_plus));
        courseModelArrayList.add(new CourseModel("Java Course", R.drawable.java));
        courseModelArrayList.add(new CourseModel("Kotlin Course", R.drawable.kotlin));
        courseModelArrayList.add(new CourseModel("Python Course", R.drawable.python));
        courseModelArrayList.add(new CourseModel("Swift Course", R.drawable.swift));
        courseModelArrayList.add(new CourseModel("Dart Course", R.drawable.dart));
        courseModelArrayList.add(new CourseModel("Flutter Course", R.drawable.flutter));


        // Attach the Adapter
        MyAdapter myAdapter = new MyAdapter(this, courseModelArrayList);
        gridView.setAdapter(myAdapter);


    }
}