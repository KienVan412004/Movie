package org.example.movie.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.movie.common.AuditEntity;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Builder
@Table(name = "account")
public class Account extends AuditEntity {

    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String email;

    private String password;

    private String role;

    private String fullName;

    private String phoneNumber;

    private Integer status;

    private Integer gender;

    private LocalDateTime dateOfBirth;


}
