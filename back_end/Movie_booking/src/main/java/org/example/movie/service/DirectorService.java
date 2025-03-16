package org.example.movie.service;

import org.example.movie.entity.Director;
import org.example.movie.model.request.DirectorCreateRequest;
import org.example.movie.model.request.FilterActorRequest;
import org.example.movie.model.request.FilterDirectorRequest;
import org.example.movie.model.response.DirectorGetAllResponse;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface DirectorService {

    Page<DirectorGetAllResponse> getAllDirector(FilterDirectorRequest request, Integer page, Integer size);

    Director createDirector(DirectorCreateRequest request);

    Director updtaeDirector(DirectorCreateRequest request , String id);

    Optional<Director> getDirectorById(String id);

    void deleteDirector(String id);

}
