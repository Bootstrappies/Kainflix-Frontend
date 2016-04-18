package io.github.bootstrappies.controllers;

import io.github.bootstrappies.beans.Customer;
import io.github.bootstrappies.beans.Movie;
import io.github.bootstrappies.beans.Order;
import io.github.bootstrappies.beans.Rating;
import org.springframework.web.client.RestTemplate;

import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by lukas on 18.04.2016.
 */

public class ListController {
    private static ListController instance;

    private LinkedList<Movie> movies = new LinkedList<>();
    private LinkedList<Rating> ratings = new LinkedList<>();
    private LinkedList<Customer> customers = new LinkedList<>();
    private LinkedList<Order> orders = new LinkedList<>();

    private ListController() {
        RestTemplate restTemplate = new RestTemplate();

        Movie movie = restTemplate.getForObject("http://demo4811414.mockable.io/movie", Movie.class);
        Rating rating = restTemplate.getForObject("http://demo4811414.mockable.io/rating", Rating.class);
        Customer customer = restTemplate.getForObject("http://demo4811414.mockable.io/customer", Customer.class);

        this.addMovie(movie);
        this.addRating(rating);
        this.addCustomer(customer);
    }

    public synchronized static ListController getInstance() {
        if (instance == null)
            instance = new ListController();
        return instance;
    }

    public synchronized void addMovie(Movie movie) {
        if (!movies.contains(movie)) {
            movies.add(movie);
            movies.sort((m1, m2) -> m1.getName().compareTo(m2.getName()));
        }
    }

    public synchronized void addRating(Rating rating) {
        if (!ratings.contains(rating)) {
            ratings.add(rating);
        }
    }

    public synchronized void addCustomer(Customer customer) {
        if (!customers.contains(customer)) {
            customers.add(customer);
            customers.sort(Comparator.comparing(Customer::getLastname).thenComparing(Customer::getForname));
        }
    }

    public synchronized void addOrder(Order order) {
        if (!orders.contains(order)) {
            orders.add(order);
            orders.sort(Comparator.comparing(Order::getStatus));
        }
    }

    public synchronized void deleteMovie(Movie movie)
    {
        movies.remove(movie);
    }

    public synchronized void deleteRating(Rating rating)
    {
        ratings.remove(rating);
    }

    public synchronized void deleteCustomer(Customer customer)
    {
        customers.remove(customer);
    }

    public synchronized void deleteOrder(Order order)
    {
        orders.remove(order);
    }
}
