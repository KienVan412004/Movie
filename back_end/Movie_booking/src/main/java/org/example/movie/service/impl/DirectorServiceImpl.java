package org.example.movie.service.impl;

import jakarta.persistence.EntityNotFoundException;
import org.example.movie.entity.Director;
import org.example.movie.model.request.DirectorCreateRequest;
import org.example.movie.model.request.FilterActorRequest;
import org.example.movie.model.request.FilterDirectorRequest;
import org.example.movie.model.response.DirectorGetAllResponse;
import org.example.movie.repository.DirectorRepository;
import org.example.movie.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class DirectorServiceImpl implements DirectorService {

    @Autowired private DirectorRepository directorRepository;

    @Override
    public Page<DirectorGetAllResponse> getAllDirector(FilterDirectorRequest request, Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page, size);
        return directorRepository.getAllDirectors(request,pageable);
    }

    @Override
    public Director createDirector(DirectorCreateRequest request) {
        Director director = new Director();
        director.setName(request.getName());
        director.setDateOfBirth(request.getDateOfBirth());
        director.setGender(request.getGender());
        director.setCreatedDate(LocalDateTime.now());
        return directorRepository.save(director);
    }

    @Override
    public Director updtaeDirector(DirectorCreateRequest request, String id) {
        Optional<Director> director = directorRepository.findById(id);
        if (director.isPresent()) {
            Director directorData = director.get();
            directorData.setName(request.getName());
            directorData.setDateOfBirth(request.getDateOfBirth());
            directorData.setGender(request.getGender());
            directorData.setUpdatedDate(LocalDateTime.now());
            return directorRepository.save(directorData);
        }else {
            throw new EntityNotFoundException(id + "not found");
        }

    }

    @Override
    public Optional<Director> getDirectorById(String id) {
        return directorRepository.findById(id);
    }

    @Override
    public void deleteDirector(String id) {
        directorRepository.deleteById(id);
    }
}
