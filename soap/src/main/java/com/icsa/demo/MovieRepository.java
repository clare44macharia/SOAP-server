package com.icsa.demo;


import localhost.movies.Movie;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class MovieRepository {
    private Map<String, Movie> movies = new HashMap<>();
    @PostConstruct
    public void  populateMovies()
    {
        Movie movie = new Movie();
        movie.setGenre("Science Fiction");
        movie.setName("The Flash");
        movie.setYearRelease(2019);


        Movie movie1 = new Movie();
        movie1.setGenre("Comedy");
        movie1.setName("Funny");
        movie1.setYearRelease(2019);



        Movie movie2 = new Movie();
        movie2.setGenre("RomCom");
        movie2.setName("Hustlers");
        movie2.setYearRelease(2017);


        movies.put(movie.getName(), movie);
        movies.put(movie1.getName(), movie1);
        movies.put(movie2.getName(),movie2);

    }

    public Movie getMovie(String name)
    {
        return  movies.get(movies);
    }
}
