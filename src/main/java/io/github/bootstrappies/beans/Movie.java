package io.github.bootstrappies.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Corinna on 12.04.2016.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie
{
    /**
     * •	The movie has a Name, Director, Writer, List of Stars (Max: 3 Stars), ProductID, Date of Release, Short Description, Rating, Duration, Genres, Price
     */

    private String name;
    private String director;
    private String writer;
    private int id;
    private Date release;
    private String desc;
    private List<String> stars;
    private double duration;
    private List<String> genres;
    private double price;
    private Rating rating;

    public Movie() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getRelease() {
        return release;
    }

    public void setRelease(Date release) {
        this.release = release;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<String> getStars() {
        return stars;
    }

    public void setStars(List<String> stars) {
        this.stars = stars;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        if (id != movie.id) return false;
        if (Double.compare(movie.duration, duration) != 0) return false;
        if (Double.compare(movie.price, price) != 0) return false;
        if (name != null ? !name.equals(movie.name) : movie.name != null) return false;
        if (director != null ? !director.equals(movie.director) : movie.director != null) return false;
        if (writer != null ? !writer.equals(movie.writer) : movie.writer != null) return false;
        if (release != null ? !release.equals(movie.release) : movie.release != null) return false;
        if (desc != null ? !desc.equals(movie.desc) : movie.desc != null) return false;
        if (stars != null ? !stars.equals(movie.stars) : movie.stars != null) return false;
        if (genres != null ? !genres.equals(movie.genres) : movie.genres != null) return false;
        return !(rating != null ? !rating.equals(movie.rating) : movie.rating != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (director != null ? director.hashCode() : 0);
        result = 31 * result + (writer != null ? writer.hashCode() : 0);
        result = 31 * result + id;
        result = 31 * result + (release != null ? release.hashCode() : 0);
        result = 31 * result + (desc != null ? desc.hashCode() : 0);
        result = 31 * result + (stars != null ? stars.hashCode() : 0);
        temp = Double.doubleToLongBits(duration);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (genres != null ? genres.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", writer='" + writer + '\'' +
                ", rating=" + rating +
                ", id=" + id +
                ", release=" + release +
                ", desc='" + desc + '\'' +
                ", stars=" + stars +
                ", duration=" + duration +
                ", genres=" + genres +
                ", price=" + price +
                '}';
    }
}
