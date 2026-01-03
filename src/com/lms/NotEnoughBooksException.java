package com.lms;

public class NotEnoughBooksException extends RuntimeException {
    public NotEnoughBooksException(String message) {

        super(message);
    }
}
