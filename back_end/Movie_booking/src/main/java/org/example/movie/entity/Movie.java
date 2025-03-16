package org.example.movie.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.movie.common.AuditEntity;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Builder
@Table(name = "movie")
public class Movie extends AuditEntity {

    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private Integer duration;

    private String language;

    private String description;

    private Date releaseDate;

    private String poster;
}
