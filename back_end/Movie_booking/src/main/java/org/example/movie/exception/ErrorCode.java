package org.example.movie.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {

    USER_EXISTERD(1001,"USER EXISTED");

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

}
