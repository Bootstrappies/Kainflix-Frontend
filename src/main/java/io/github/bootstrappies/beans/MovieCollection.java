package io.github.bootstrappies.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by cdminix on 18.04.2016.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieCollection {

    private List<Movie> movies;

    public MovieCollection() {
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        String result = "";
        for (Movie movie : movies) {
            result += "\n" + movie.toString();
        }
        return result;
    }
}
