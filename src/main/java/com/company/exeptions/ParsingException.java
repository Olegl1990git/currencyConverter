package com.company.exeptions;

public class ParsingException extends RuntimeException {

    public ParsingException(String message, Throwable cause) {
        super(message, cause);
    }
}
