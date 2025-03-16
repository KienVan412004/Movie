package org.example.movie.service.impl;

import org.example.movie.entity.Genre;
import org.example.movie.model.request.GenreCreateRequest;
import org.example.movie.model.response.GenreGetAllResponse;
import org.example.movie.repository.GenreRepository;
import org.example.movie.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class GenreServiceImpl implements GenreService {

    @Autowired private GenreRepository genreRepository;

    @Override
    public Page<GenreGetAllResponse> getAllGenres(Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page, size);
        return genreRepository.getAllGenres(pageable);
    }

    @Override
    public Genre createGenre(GenreCreateRequest request) {
        Genre genre = new Genre();
        genre.setName(request.getName());
        genre.setCreatedDate(LocalDateTime.now());
        return genreRepository.save(genre);

    }

    @Override
    public Genre updateGenre(GenreCreateRequest request, String id) {
        Optional<Genre> genre = genreRepository.findById(id);
        if (genre.isPresent()) {
            Genre genreUpdate = genre.get();
            genreUpdate.setName(request.getName());
            genreUpdate.setUpdatedDate(LocalDateTime.now());
            return genreRepository.save(genreUpdate);
        }else {
            throw new RuntimeException("Genre not found");
        }

    }

    @Override
    public void deleteGenre(String id) {
        genreRepository.deleteById(id);
    }

    @Override
    public Optional<Genre> getGenreById(String id) {
        return genreRepository.findById(id);
    }
}
