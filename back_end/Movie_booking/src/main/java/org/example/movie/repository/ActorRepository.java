package org.example.movie.repository;

import org.example.movie.entity.Actor;
import org.example.movie.model.request.FilterActorRequest;
import org.example.movie.model.response.ActorGetAllResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorRepository extends JpaRepository<Actor,String> {

    @Query(value = """
        select ac.id, ac.name, ac.date_of_birth as dateOfBirth, ac.gender from actor ac 
        where (:#{#request.name} IS NULL OR ac.name like %:#{#request.name}% )
        """,nativeQuery = true)
    Page<ActorGetAllResponse> getAllActor(@Param("request")FilterActorRequest request, Pageable pageable);
}
