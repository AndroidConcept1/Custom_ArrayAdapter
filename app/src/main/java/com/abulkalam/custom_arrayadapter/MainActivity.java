package com.abulkalam.custom_arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<NumberView> arrayList = new ArrayList<NumberView>();

        arrayList.add(new NumberView(R.drawable.book1, "1","Book"));
        arrayList.add(new NumberView(R.drawable.book1, "2","Book"));
        arrayList.add(new NumberView(R.drawable.book1, "3","Book"));
        arrayList.add(new NumberView(R.drawable.book1, "4","Book"));
        arrayList.add(new NumberView(R.drawable.book1, "5","Book"));
        arrayList.add(new NumberView(R.drawable.book1, "6","Book"));
        arrayList.add(new NumberView(R.drawable.book1, "7","Book"));
        arrayList.add(new NumberView(R.drawable.book1, "8","Book"));
        arrayList.add(new NumberView(R.drawable.book1, "9","Book"));
        arrayList.add(new NumberView(R.drawable.book1, "10","Book"));

        NumberViewAdapter numberArrayAdapter = new NumberViewAdapter(this, arrayList);

        ListView numberListView = findViewById(R.id.listView);

        numberListView.setAdapter(numberArrayAdapter);


    }
}