package org.example.movie.model.response;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MovieResponse {
    private String name;

    private Integer duration;

    private String language;

    private String description;

    private Date releaseDate;

    private String poster;
}
