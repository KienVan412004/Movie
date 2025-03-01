package org.example.movie.service;

import org.example.movie.entity.Actor;
import org.example.movie.model.request.ActorCreateRequest;

import java.util.List;
import java.util.Optional;

public interface ActorService {

    List<Actor> getAll();

    Actor createActor(ActorCreateRequest actorCreateRequest);

    Actor updateActor(ActorCreateRequest actorCreateRequest, String id);

    void deleteActor(String id);

    Optional<Actor> getOneActor(String id);
}
