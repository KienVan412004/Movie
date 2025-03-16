package org.example.movie.repository;

import org.example.movie.entity.Director;
import org.example.movie.model.request.FilterDirectorRequest;
import org.example.movie.model.response.DirectorGetAllResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepository extends JpaRepository<Director, String> {

    @Query(value = """  
        select dr.id, dr.name, dr.date_of_birth as dateOfBirth, dr.gender from director dr 
        where (:#{#request.name} IS NULL OR dr.name LIKE %:#{#request.name}% ) order by dr.created_date  desc 
        """,nativeQuery = true)
    Page<DirectorGetAllResponse> getAllDirectors(@Param("request") FilterDirectorRequest request, Pageable pageable);
}
