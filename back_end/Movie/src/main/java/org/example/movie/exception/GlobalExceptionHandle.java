package org.example.movie.exception;

import org.example.movie.entity.Account;
import org.example.movie.model.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandle {
    @ExceptionHandler(value = RuntimeException.class)
    ResponseEntity<ApiResponse> runtimeExceptionHandler(RuntimeException exception) {

        ApiResponse response = new ApiResponse();

        response.setCode(1001);
        response.setMessage(exception.getMessage());

        return ResponseEntity.badRequest().body(response);
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    ResponseEntity<ApiResponse> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException exception) {

        ApiResponse response = new ApiResponse();

        response.setCode(1001);
        response.setMessage(exception.getFieldError().getDefaultMessage());

        return ResponseEntity.badRequest().body(response);
    }

}
