package org.example.movie.controller;

import org.example.movie.entity.Genre;
import org.example.movie.model.request.GenreCreateRequest;
import org.example.movie.model.response.GenreGetAllResponse;
import org.example.movie.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/genre/")
@CrossOrigin("*")
public class GenreController {

    @Autowired private GenreService genreService;

    @GetMapping("")
    public Page<GenreGetAllResponse> getAllGenres(Integer page, Integer size) {
        return genreService.getAllGenres(page, size);
    }

    @PostMapping("create")
    public Genre createGenre(@RequestBody GenreCreateRequest request) {
        return genreService.createGenre(request);
    }

    @PutMapping("update/{id}")
    public Genre updateGenre(@RequestBody GenreCreateRequest request, @PathVariable String id) {
        return genreService.updateGenre(request,id);
    }

    @DeleteMapping("delete/{id}")
    public void deleteGenre(@PathVariable String id) {
        genreService.deleteGenre(id);
    }

    @GetMapping("get-one/{id}")
    public Optional<Genre> getGenre(@PathVariable String id) {
        return genreService.getGenreById(id);
    }
}
