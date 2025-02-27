package com.menegheti.springboot3_profile_mng.exception;

public class PersonSaveOrUpdateByIdFailedException extends RuntimeException {
    private String message;

    public PersonSaveOrUpdateByIdFailedException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
