package io.github.bootstrappies.beans;

/**
 * Created by Corinna on 12.04.2016.
 */
public class Order {
    /*
    •	productId, customerId, Movie Details (Name, Release Date, Duration, Rating, Price) and Status Flag are returned
     */

    private Movie movie;
    private Customer customer;
    private int anz;
    private String status;

    public Order() {
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getAnz() {
        return anz;
    }

    public void setAnz(int anz) {
        this.anz = anz;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (anz != order.anz) return false;
        if (movie != null ? !movie.equals(order.movie) : order.movie != null) return false;
        if (customer != null ? !customer.equals(order.customer) : order.customer != null) return false;
        return !(status != null ? !status.equals(order.status) : order.status != null);

    }

    @Override
    public int hashCode() {
        int result = movie != null ? movie.hashCode() : 0;
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        result = 31 * result + anz;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "movie=" + movie +
                ", customer=" + customer +
                ", anz=" + anz +
                ", status='" + status + '\'' +
                '}';
    }
}
