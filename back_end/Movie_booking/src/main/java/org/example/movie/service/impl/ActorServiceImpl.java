package org.example.movie.service.impl;

import jakarta.persistence.EntityNotFoundException;
import org.example.movie.entity.Actor;
import org.example.movie.model.request.ActorCreateRequest;
import org.example.movie.model.request.FilterActorRequest;
import org.example.movie.model.response.ActorGetAllResponse;
import org.example.movie.repository.ActorRepository;
import org.example.movie.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

@Service
public class ActorServiceImpl implements ActorService {

    @Autowired
    private ActorRepository actorRepository;

    @Override
    public Page<ActorGetAllResponse> getAll(Integer page,Integer size, FilterActorRequest request) {
        Pageable pageable = PageRequest.of(page, size);
        return actorRepository.getAllActor(request,pageable);
    }

    @Override
    public Actor createActor(ActorCreateRequest actorCreateRequest) {
        Actor actor = new Actor();
        actor.setName(actorCreateRequest.getName());
        actor.setDateOfBirth(actorCreateRequest.getDateOfBirth());
        actor.setGender(actorCreateRequest.getGender());
        actor.setCreatedDate(LocalDateTime.now());
        return actorRepository.save(actor);
    }

    @Override
    public Actor updateActor(ActorCreateRequest actorCreateRequest, String id) {
        Optional<Actor> OptionActor = actorRepository.findById(id);
        if(OptionActor.isPresent()){
            Actor actor = OptionActor.get();
            actor.setName(actorCreateRequest.getName());
            actor.setDateOfBirth(actorCreateRequest.getDateOfBirth());
            actor.setGender(actorCreateRequest.getGender());
            actor.setUpdatedDate(LocalDateTime.now());
            return actorRepository.save(actor);
        }else{
            throw new EntityNotFoundException(id + "not found");
        }
    }

    @Override
    public void deleteActor(String id) {
        actorRepository.deleteById(id);
    }

    @Override
    public Optional<Actor> getOneActor(String id) {
        return actorRepository.findById(id);
    }
}
