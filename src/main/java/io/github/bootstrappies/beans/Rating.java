package io.github.bootstrappies.beans;


/**
 * Created by Corinna on 12.04.2016.
 */
public class Rating {
    /*
    •	A Rating from 1 to 5 is send.
•	A ratingId returned
•	Average Rating of movie is updated

     */
    private int id;
    private double avgRating;

    public Rating(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "id=" + id +
                ", avgRating=" + avgRating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rating rating = (Rating) o;

        if (id != rating.id) return false;
        return Double.compare(rating.avgRating, avgRating) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        temp = Double.doubleToLongBits(avgRating);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
