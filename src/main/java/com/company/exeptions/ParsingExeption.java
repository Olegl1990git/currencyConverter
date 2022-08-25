package com.company.exeptions;

public class ParsingExeption extends RuntimeException{
    public ParsingExeption() {
    }

    public ParsingExeption(String message) {
        super(message);
    }

    public ParsingExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public ParsingExeption(Throwable cause) {
        super(cause);
    }

    public ParsingExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
