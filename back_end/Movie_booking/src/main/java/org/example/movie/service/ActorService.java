package org.example.movie.service;

import org.example.movie.entity.Actor;
import org.example.movie.model.request.ActorCreateRequest;
import org.example.movie.model.request.FilterActorRequest;
import org.example.movie.model.response.ActorGetAllResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ActorService {

    Page<ActorGetAllResponse> getAll(Integer page, Integer size, FilterActorRequest request);

    Actor createActor(ActorCreateRequest actorCreateRequest);

    Actor updateActor(ActorCreateRequest actorCreateRequest, String id);

    void deleteActor(String id);

    Optional<Actor> getOneActor(String id);
}
