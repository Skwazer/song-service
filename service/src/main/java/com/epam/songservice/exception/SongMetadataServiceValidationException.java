package com.epam.songservice.exception;


public class SongMetadataServiceValidationException extends IllegalArgumentException {
    public SongMetadataServiceValidationException(String message) {
        super(message);
    }
}
