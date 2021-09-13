package com.example.mymovies.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mymovies.modle.Modell;
import com.example.mymovies.R;

public class Main2Activity extends AppCompatActivity {

    ImageView imageView;
    TextView name , genre , year , description;
    Bundle bundle;
    Modell modell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView = findViewById(R.id.imagedetails);
        name = findViewById(R.id.name);
        genre = findViewById(R.id.genre);
        year = findViewById(R.id.year);
        description = findViewById(R.id.description);
        bundle = getIntent().getExtras();

        modell = new Modell();

        if (bundle != null){
            name.setText(bundle.getString("title"));
            genre.setText(bundle.getString("genre"));
            year.setText(bundle.getString("year"));
            description.setText(modell.getDescriptionById(bundle.getInt("id")));
            imageView.setImageResource(bundle.getInt("image"));
        }





    }
}
