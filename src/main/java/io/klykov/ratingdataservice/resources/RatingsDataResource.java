package io.klykov.ratingdataservice.resources;

import io.klykov.ratingdataservice.models.Rating;
import io.klykov.ratingdataservice.models.UserRating;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId, 9);
    }

    @RequestMapping("user/{userId}")
    public UserRating getUsertRatings(@PathVariable("userId") String movieId){

        List<Rating> ratings = Arrays.asList(
                new Rating("1", 4),
                new Rating("2", 5)
        );

        return new UserRating(ratings);
    }
}
