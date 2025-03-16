package org.example.movie.controller;

import org.example.movie.entity.Actor;
import org.example.movie.model.request.ActorCreateRequest;
import org.example.movie.model.request.FilterActorRequest;
import org.example.movie.model.response.ActorGetAllResponse;
import org.example.movie.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/actor/")
@CrossOrigin("*")
public class ActorController {

    @Autowired
    private ActorService actorService;

    @GetMapping("")
    public Page<ActorGetAllResponse> getAllActors(Integer page, Integer size, FilterActorRequest request) {
        return actorService.getAll(page,size,request);
    }

    @PostMapping("create")
    public Actor createActor(@RequestBody ActorCreateRequest actor) {
        return actorService.createActor(actor);
    }

    @PutMapping("update/{id}")
    public Actor updateActor(@PathVariable String id,  @RequestBody ActorCreateRequest actor) {
        return actorService.updateActor(actor,id);
    }

    @DeleteMapping("delete/{id}")
    public void deleteActor(@PathVariable String id) {
        actorService.deleteActor(id);
    }

    @GetMapping("get-one/{id}")
    public Optional<Actor> getActor(@PathVariable String id) {
        return actorService.getOneActor(id);
    }
}
