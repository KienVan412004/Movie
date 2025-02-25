package org.example.movie.service.impl;

import org.example.movie.entity.Movie;
import org.example.movie.model.response.MovieResponse;
import org.example.movie.repository.MovieRepository;
import org.example.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieRepository movieRepository;
    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
}
