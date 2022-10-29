package com.epam.songservice.exception;


public class SongMetadataIdAlreadyExists extends RuntimeException {
    public SongMetadataIdAlreadyExists(String message) {
        super(message);
    }
}
