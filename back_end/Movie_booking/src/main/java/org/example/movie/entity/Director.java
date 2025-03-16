package org.example.movie.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.movie.common.AuditEntity;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "director")
public class Director extends AuditEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private Date dateOfBirth;

    private Integer gender;
}
