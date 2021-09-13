 package com.example.mymovies.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mymovies.modle.Modell;
import com.example.mymovies.R;

 public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView, recyclerView2;
    MoviesAdapter moviesAdapter;
    Modell modell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        recyclerView = findViewById(R.id.recyclerview);

        modell = new Modell();

        moviesAdapter = new MoviesAdapter(this,modell.getMovieList());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(moviesAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());





 }
