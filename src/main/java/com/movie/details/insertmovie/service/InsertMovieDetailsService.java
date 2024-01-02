package com.movie.details.insertmovie.service;


import com.movie.details.insertmovie.service.models.request.MovieDetailsInputDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InsertMovieDetailsService extends MongoRepository<MovieDetailsInputDTO, String> {
}
