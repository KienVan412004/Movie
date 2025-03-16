package org.example.movie.repository;

import org.example.movie.entity.Genre;
import org.example.movie.model.response.GenreGetAllResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, String> {

    @Query(value = """
    select g.id, g.name from genre g  ORDER BY g.created_date
    """,nativeQuery = true)
    Page<GenreGetAllResponse> getAllGenres( Pageable pageable);
}
