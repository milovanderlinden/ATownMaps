package com.example.brand_000.atownmap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class ExploreActivity extends AppCompatActivity {

    private List<MapInfo> places = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        RecyclerView placeList = (RecyclerView)findViewById(R.id.location_list);
        final LinearLayoutManager llm = new LinearLayoutManager(this);

        placeList.setLayoutManager(llm);

        places.add(new MapInfo("August Town Church", "Old Tyres and Bottles in the back"));
        places.add(new MapInfo("House", "Oil pans storing water"));

        PlaceListAdapter adapter = new PlaceListAdapter(places);
        placeList.setAdapter(adapter);
    }

    public void viewMap(View view)
    {
        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);
    }
}
