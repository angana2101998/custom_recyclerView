package com.example.rv_custom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridLayout;

import com.example.rv_custom.adapter.tripadapter;
import com.example.rv_custom.models.Ads;
import com.example.rv_custom.models.item;
import com.example.rv_custom.models.news;
import com.example.rv_custom.models.trip;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=findViewById(R.id.rv);

        List<item> items=new ArrayList<>();
        trip trip1=new trip(R.drawable.new3, "BALI","Summer 2021-20 days");
        items.add(new item(0,trip1));

        Ads ads1=new Ads( " WELCOME TO THE HOLIDAY SEASON","GET 70% OFF ON YOUR FIRST TRIP");
        items.add(new item(1,ads1));

        news news1=new news( "BALI","Bali Tourism, Indonesia: Places, Best Time & Travel Guides ...");
        items.add(new item(2,news1));

        trip trip2=new trip(R.drawable.darjeeling, "Darjeeling","Summer 2021-20 days");
        items.add(new item(0,trip2));

        news news2=new news( "Darjeeling","Darjeeling Tour Packages - Book Darjeeling Packages at Best ...");
        items.add(new item(2,news2));


        trip trip3=new trip(R.drawable.goa, "GOA","Summer 2021-15 days");
        items.add(new item(0,trip3));
        Ads ads2=new Ads( "WELCOME TO THE HOLIDAY SEASON","GET 50% OFF ON YOUR FIRST TRIP");
        items.add(new item(1,ads2));
recyclerView.setAdapter(new tripadapter(items));

//GridLayout gridLayout=new GridLayout(this, 2);
       /* GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);*/
    }
}