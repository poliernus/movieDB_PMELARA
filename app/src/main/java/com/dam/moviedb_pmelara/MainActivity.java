package com.dam.moviedb_pmelara;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static String TopRated_URL = "https://api.themoviedb.org/3/movie/top_rated?api_key=b4e8d6028f6da7ecb054dea196361afc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}