package com.example.recyclerviewsannan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
List<Movie> teamPlayer = new ArrayList<>();

MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview1);
        myAdapter= new MyAdapter(teamPlayer);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(myAdapter);
        insertData();
    }

    private void insertData() {
    Movie movie= new Movie("Pakistan","Lahore","2019");
        teamPlayer.add(movie);
        movie= new Movie("India","Bangalore","2015");
        teamPlayer.add(movie);
        movie= new Movie("SriLanka","Koalalampu","2014");
        teamPlayer.add(movie);
        movie= new Movie("Egypt","malta","2015");
        teamPlayer.add(movie);
        movie= new Movie("Indones","prita","2015");
        teamPlayer.add(movie);
        movie= new Movie("Greenland","bana","2015");
        teamPlayer.add(movie);
        movie= new Movie("Chula","bana","2015");
        teamPlayer.add(movie);
    myAdapter.notifyDataSetChanged();
    }
}