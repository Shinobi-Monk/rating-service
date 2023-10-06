package com.shinobimonk.rating.service.controller;

import com.shinobimonk.rating.service.entites.Rating;
import com.shinobimonk.rating.service.services.RatingService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpStatusCodeException;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {
    @Autowired
    private RatingService ratingService;

    @PostMapping
    public ResponseEntity<Rating> saveRating(@RequestBody Rating rating) {
        return new ResponseEntity<>(ratingService.saveRating(rating), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Rating>> fetchAllRating() {
        return new ResponseEntity<>(ratingService.fetchAllRating(), HttpStatus.OK);
    }

    @GetMapping("user/{userId}")
    public ResponseEntity<List<Rating>> fetchRatingByUserId(@PathVariable String userId) {
        return new ResponseEntity<>(ratingService.fetchAllRatingByUserId(userId), HttpStatus.OK);
    }
    @GetMapping("hotel/{hotelId}")
    public ResponseEntity<List<Rating>> fetchRatingByHotelId(@PathVariable String hotelId) {
        return new ResponseEntity<>(ratingService.fetchAllRatingByHotelId(hotelId), HttpStatus.OK);
    }
}
