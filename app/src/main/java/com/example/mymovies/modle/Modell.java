package com.example.mymovies.modle;

import com.example.mymovies.R;

import java.util.ArrayList;
import java.util.List;

public class Modell {

    public Modell() {
        moviesData();
        description();
    }

    List<Movie> movieList = new ArrayList<>();
    List<Description> description = new ArrayList<>();

    private void moviesData() {
        Movie movie1 = new Movie("Brides of Prey" , "Action | Adventure | Crime" , "2020" , 1 , R.drawable.m1);
        movieList.add(movie1);

        Movie movie2 = new Movie("The Ledge" , "Drama | Horror | Thriller" , "2019" , 2 , R.drawable.m2);
        movieList.add(movie2);

        Movie movie3 = new Movie("Shikara" , "Drama | History | Romance" , "2020" , 3, R.drawable.m3);
        movieList.add(movie3);

        Movie movie4 = new Movie("Malang" , "Action | Romance " , "2020" , 4, R.drawable.m4);
        movieList.add(movie4);

        Movie movie5 = new Movie("Come to Daddy" , "Comedy | Horror | Thriller" , "2019" , 5, R.drawable.m5);
        movieList.add(movie5);

        Movie movie6 = new Movie("And Then We Danced" , "Drama | Romance " , "2019" , 6, R.drawable.m6);
        movieList.add(movie6);

        Movie movie7 = new Movie("Waiting for Anya" , "Drama | War " , "2020" ,7, R.drawable.m7);
        movieList.add(movie7);

        Movie movie8 = new Movie("Legend of Deification" , "Animation | Family | Fantasy" , "2020", 8, R.drawable.m8);
        movieList.add(movie8);

        Movie movie9 = new Movie("Bad Boys for Life" , "Action | Drama" , "2020", 9, R.drawable.m9);
        movieList.add(movie9);

        Movie movie10 = new Movie("Money Heist: The Phenomenon " , "Action | Crime" , "2020" , 10, R.drawable.m10);
        movieList.add(movie10);
    }

    public List<Movie> getMovieList() {
        return movieList;
    }


    public void description() {
        Description description1 = new Description("Birds of Prey is a 2020 American superhero film based on the DC Comics team Birds of Prey. It is the eighth film in the DC Extended Universe and a follow-up to  ..." ,
                1);
        description.add(description1);
        Description description2 = new Description("is a 2011 American thriller drama film written and directed by Matthew Chapman, starring Charlie Hunnam, Terrence Howard, Liv Tyler, Christopher Gorham, and Patrick Wilson." ,
                2);
        description.add(description2);
        Description description3 = new Description(" is a 2020 Indian Hindi-language romantic drama film produced and directed by Vidhu Vinod Chopra. The film is based on the love story of a Kashmiri  ..." ,
                3);
        description.add(description3);
        Description description4 = new Description("Malang ( transl. Vagrant) is a 2020 Indian Hindi-language action thriller film directed by Mohit Suri and produced by Luv Ranjan, Ankur Garg, Bhushan Kumar, ..." ,
                4);
        description.add(description4);
        Description description5 = new Description("(2019) R | 1h 36min | Comedy, Horror, Thriller | 7 February 2020 (USA) 2:11 | Trailer. 4 VIDEOS | 10 IMAGES. A man in his thirties travels to a remote cabin to reconnect with his estranged father." ,
                5);
        description.add(description5);
        Description description6 = new Description("Directed by Levan Akin. With Levan Gelbakhiani, Bachi Valishvili, Ana Javakishvili, Kakha Gogidze. A passionate coming-of-age tale set amidst the conservative ..." ,
                6);
        description.add(description6);
        Description description7 = new Description(" is a children's novel by Michael Morpurgo, first published in Great Britain in 1990, by William Heinemann. It is set in Lescun, in a mountainous  ..." ,
                7);
        description.add(description7);
        Description description8 = new Description("Directed by Teng Cheng, Li Wei. Atop the ruins of war, top commander JIANG ZIYA is given the task to banish the Nine-tailed Fox Demon who threatens all ..." ,
                8);
        description.add(description8);
        Description description9 = new Description("Bad Boys for Life is a 2020 American action comedy film directed by Adil El Arbi and Bilall Fallah and written by Chris Bremner, Peter Craig and Joe Carnahan. The sequel to Bad Boys II (2003)" , 9);
        description.add(description9);
        Description description10 = new Description("La casa de papel: El fenómeno (2020) 57min | Documentary | TV Special 3 April 2020. A documentary on why and how \"Money Heist\" sparked a wave of enthusiasm around the world for a lovable group of thieves and their professor." , 10);
        description.add(description10);
    }


    public String getDescriptionById (int id){
        for (int i = 0; i <description.size() ; i++) {
            if (id == description.get(i).id){
                return description.get(i).description;
            }
        }
        return "Kos ommak";
    }
}
