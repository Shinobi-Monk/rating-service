package com.shinobimonk.rating.service.services.impl;

import com.shinobimonk.rating.service.entites.Rating;
import com.shinobimonk.rating.service.repositories.RatingRepository;
import com.shinobimonk.rating.service.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;
    @Override
    public Rating saveRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> fetchAllRating() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> fetchAllRatingByUserId(String userId) {
        return ratingRepository.findRatingsByUserId(userId);
    }

    @Override
    public List<Rating> fetchAllRatingByHotelId(String hotelId) {
        return ratingRepository.findRatingsByHotelId(hotelId);
    }
}
