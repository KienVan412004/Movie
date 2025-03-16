package org.example.movie.controller;

import org.example.movie.entity.Director;
import org.example.movie.model.request.DirectorCreateRequest;
import org.example.movie.model.request.FilterDirectorRequest;
import org.example.movie.model.response.DirectorGetAllResponse;
import org.example.movie.service.impl.DirectorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/director/")
@CrossOrigin("*")
public class DirectorController {

    @Autowired private DirectorServiceImpl directorService;

    @GetMapping("")
    public Page<DirectorGetAllResponse> getAllDirector(FilterDirectorRequest request, Integer page, Integer size){
        return directorService.getAllDirector(request,page,size);
    }

    @PostMapping("create")
    public Director createDirector(@RequestBody DirectorCreateRequest request){
        return directorService.createDirector(request);
    }

    @PutMapping("update/{id}")
    public Director updateDirector(@RequestBody DirectorCreateRequest request, @PathVariable String id){
        return directorService.updtaeDirector(request,id);
    }

    @DeleteMapping("delete/{id}")
    public void deleteDirector(@PathVariable String id){
        directorService.deleteDirector(id);
    }

    @GetMapping("get-one/{id}")
    public Optional<Director> getOneDirector(@PathVariable String id){
        return directorService.getDirectorById(id);
    }

}
