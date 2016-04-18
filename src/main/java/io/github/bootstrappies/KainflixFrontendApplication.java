package io.github.bootstrappies;

import io.github.bootstrappies.beans.Customer;
import io.github.bootstrappies.beans.Movie;
import io.github.bootstrappies.beans.MovieCollection;
import io.github.bootstrappies.beans.Rating;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class KainflixFrontendApplication implements CommandLineRunner
{

	private static final Logger log = LoggerFactory.getLogger(KainflixFrontendApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(KainflixFrontendApplication.class, args);
	}


	@Override
	public void run(String... strings) throws Exception {
		RestTemplate restTemplate = new RestTemplate();
		MovieCollection movies = restTemplate.getForObject("http://demo4811414.mockable.io/movie", MovieCollection.class);
		Rating rating = restTemplate.getForObject("http://demo4811414.mockable.io/rating", Rating.class);
		Customer customer = restTemplate.getForObject("http://demo4811414.mockable.io/customer", Customer.class);
		log.info(movies.toString());
		log.info(rating.toString());
		log.info(customer.toString());
	}
}
