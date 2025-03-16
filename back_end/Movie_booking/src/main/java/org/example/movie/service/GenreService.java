package org.example.movie.service;

import org.example.movie.entity.Genre;
import org.example.movie.model.request.GenreCreateRequest;
import org.example.movie.model.response.GenreGetAllResponse;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface GenreService {
    Page<GenreGetAllResponse> getAllGenres(Integer page, Integer size);

    Genre createGenre(GenreCreateRequest request);

    Genre updateGenre(GenreCreateRequest request, String id);

    void deleteGenre(String id);

    Optional<Genre> getGenreById(String id);
}
