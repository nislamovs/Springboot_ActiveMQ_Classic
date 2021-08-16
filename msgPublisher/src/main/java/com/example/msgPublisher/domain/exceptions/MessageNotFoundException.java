package com.example.msgPublisher.domain.exceptions;


public class MessageNotFoundException extends Exception {

    public MessageNotFoundException(String msg) {
        super(msg);
    }

    public MessageNotFoundException(String msg, Throwable t) {
        super(msg, t);
    }
}
