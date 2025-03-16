package org.example.movie.common;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class AuditEntity {

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;
}
