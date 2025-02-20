package org.example.movie.model.request;

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
public class AccountUpdateRequest {

     String email;

     String password;

     String role;

     String fullName;

     String phoneNumber;

     Integer status;

     Integer gender;

     LocalDateTime dateOfBirth;
}
