package org.example.movie.model.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
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
public class AccountCreateRequest {

    @Email(message = "email is not in correct format")
     String email;

    @Size(min = 8, message = "password must be at least 8 characters")
     String password;

     String role;

    @Size(min = 3,message = "full name must be at least 3 characters")
     String fullName;

     String phoneNumber;

     Integer status;

     Integer gender;

     LocalDateTime dateOfBirth;
}
