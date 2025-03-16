package org.example.movie.service;

import org.example.movie.entity.Movie;
import org.example.movie.model.response.MovieResponse;

import java.util.List;

public interface MovieService {
    List<Movie> getAllMovies();

}
