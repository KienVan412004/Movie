package org.example.movie.model.request;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DirectorCreateRequest {
    private String name;

    private Date dateOfBirth;

    private Integer gender;
}
