package org.example.movie.model.response;

import lombok.*;

import java.util.Date;


public interface ActorGetAllResponse {

     String getId();

     String getName();

     Date getDateOfBirth();

     Integer getGender();
}
