package com.example.mymovies.view;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import com.example.mymovies.modle.Movie;
import com.example.mymovies.R;

import static com.example.mymovies.R.id.imageView;

public class MoviesAdapter extends RecyclerView.Adapter <MoviesAdapter.MyViewHolder> {


     List <Movie> moviesList;
     Context context;


    public MoviesAdapter(Context context , List moviesList) {
        this.moviesList = moviesList;
        this.context = context;

    }

    @NonNull
    @Override
    public MoviesAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movies_list_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesAdapter.MyViewHolder holder, int position) {
        final Movie movie = moviesList.get(position);
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());
        holder.image.setImageResource(movie.getImage());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Main2Activity.class);
                intent.putExtra("title",movie.getTitle());
                intent.putExtra("genre",movie.getGenre());
                intent.putExtra("year",movie.getYear());
                intent.putExtra("image",movie.getImage());
                intent.putExtra("id",movie.getId());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }



    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView title , genre , year;
        ImageView image;
        CardView cardView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            genre = itemView.findViewById(R.id.genre);
            year = itemView.findViewById(R.id.year);
            image = itemView.findViewById(imageView);
            cardView = itemView.findViewById(R.id.card);
        }


    }
}


