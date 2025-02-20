package org.example.movie.model.response;


import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountResponse {

    String email;

    String role;

    String fullName;

    String phoneNumber;

    Integer status;

    Integer gender;

    LocalDateTime dateOfBirth;
}
