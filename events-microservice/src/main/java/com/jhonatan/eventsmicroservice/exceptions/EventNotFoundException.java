package com.jhonatan.eventsmicroservice.exceptions;

public class EventNotFoundException extends RuntimeException {
    public EventNotFoundException() {
        super("Evento não encontrado");
    }

    public EventNotFoundException(String message) {
        super(message);
    }
}
