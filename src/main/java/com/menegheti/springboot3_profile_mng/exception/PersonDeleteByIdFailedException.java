package com.menegheti.springboot3_profile_mng.exception;

public class PersonDeleteByIdFailedException extends RuntimeException{
    private String message;

    public PersonDeleteByIdFailedException() {
    }

    public PersonDeleteByIdFailedException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
