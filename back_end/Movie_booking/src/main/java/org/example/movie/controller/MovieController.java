package org.example.movie.controller;

import org.example.movie.entity.Movie;
import org.example.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/movie/")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }
}
