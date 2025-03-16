package org.example.movie.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.movie.common.AuditEntity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "genre")
public class Genre extends AuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;
}
