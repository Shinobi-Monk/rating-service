package com.shinobimonk.rating.service.services;

import com.shinobimonk.rating.service.entites.Rating;

import java.util.List;

public interface RatingService {
    public Rating saveRating(Rating rating);
    public List<Rating> fetchAllRating();
    public List<Rating> fetchAllRatingByUserId(String userId);
    public List<Rating> fetchAllRatingByHotelId(String hotelId);
}
