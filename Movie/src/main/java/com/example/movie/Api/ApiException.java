package com.example.movie.Api;

public class ApiException extends RuntimeException {
    public ApiException(String message){
        super(message);
    }
}
